package com.school.sms.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger log = LoggerFactory.getLogger(LoggingAspect.class);

    @Pointcut("execution(* com.school.sms..controller..*(..))")
    public void controllerMethods() {}

    @Pointcut("execution(* com.school.sms..service..*(..))")
    public void serviceMethods() {}

    @Before("controllerMethods() || serviceMethods()")
    public void logBefore(JoinPoint joinPoint) {
        log.info("Entering method: {} with args {}",
                joinPoint.getSignature(),
                joinPoint.getArgs());
    }

    @AfterReturning(pointcut = "controllerMethods() || serviceMethods()", returning = "result")
    public void logAfter(JoinPoint joinPoint, Object result) {
        log.info("Exiting method: {} with result {}",
                joinPoint.getSignature(),
                result);
    }

    @AfterThrowing(pointcut = "controllerMethods() || serviceMethods()", throwing = "ex")
    public void logException(JoinPoint joinPoint, Throwable ex) {
        log.error("Exception in method: {} with message {}",
                joinPoint.getSignature(),
                ex.getMessage());
    }
}
