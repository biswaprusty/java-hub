package com.school.sms.service;

import org.springframework.stereotype.Service;

@Service
public class AuditService {

    public void logEvent(String event) {
        // Kafka + DB audit logging later
        System.out.println("AUDIT EVENT: " + event);
    }
}
