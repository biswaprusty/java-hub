package com.school.sms.batch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentItemProcessor implements ItemProcessor<String, String> {

    @Override
    public String process(String item) {
        // TODO: validation / transformation
        return item;
    }
}
