package com.school.sms.aop.aspect;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.time.Instant;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Aspect
@Component
@Slf4j
public class RateLimitingAspect {

    private static final int MAX_REQUESTS = 5;
    private static final long WINDOW_MS = 60_000; // 1 minute

    private final Map<String, RequestCounter> requestMap = new ConcurrentHashMap<>();

    @Around("execution(* com.school..controller..*(..))")
    public Object rateLimit(ProceedingJoinPoint joinPoint) throws Throwable {

        HttpServletRequest request = getCurrentRequest();
        String key = request.getRemoteAddr() + ":" + request.getRequestURI();

        RequestCounter counter = requestMap.computeIfAbsent(key, k -> new RequestCounter());

        synchronized (counter) {
            long now = Instant.now().toEpochMilli();

            if (now - counter.windowStart > WINDOW_MS) {
                counter.windowStart = now;
                counter.count = 0;
            }

            counter.count++;

            if (counter.count > MAX_REQUESTS) {
                log.warn("🚫 Rate limit exceeded for {}", key);
                throw new RuntimeException("Too many requests. Please try again later.");
            }
        }

        return joinPoint.proceed();
    }

    private HttpServletRequest getCurrentRequest() {
        ServletRequestAttributes attributes =
                (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();

        if (attributes == null) {
            throw new IllegalStateException("No HTTP request found");
        }
        return attributes.getRequest();
    }

    private static class RequestCounter {
        long windowStart = Instant.now().toEpochMilli();
        int count = 0;
    }
}
