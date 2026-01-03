package com.school.sms.kafka.model;

import java.time.LocalDateTime;

public class SchoolEvent {

    private String eventType;
    private String payload;
    private LocalDateTime createdAt = LocalDateTime.now();

    public SchoolEvent() {}

    public SchoolEvent(String eventType, String payload) {
        this.eventType = eventType;
        this.payload = payload;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
