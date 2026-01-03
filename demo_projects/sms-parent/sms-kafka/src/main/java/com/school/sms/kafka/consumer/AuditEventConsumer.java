package com.school.sms.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class AuditEventConsumer {

    private static final Logger log = LoggerFactory.getLogger(AuditEventConsumer.class);

    /**
     * Placeholder consumer.
     * @KafkaListener will be added later.
     */
    public void consume(String message) {
        log.info("Kafka Event Consumed: {}", message);
    }
}
