package com.school.sms.kafka.producer;

import com.school.sms.kafka.model.SchoolEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SchoolEventProducer {

    private static final Logger log = LoggerFactory.getLogger(SchoolEventProducer.class);

    /**
     * Placeholder method.
     * KafkaTemplate will be added later.
     */
    public void publishEvent(SchoolEvent event) {
        log.info("Kafka Event Produced: type={}, payload={}",
                event.getEventType(), event.getPayload());
    }
}
