package com.school.sms.batch.writer;

import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentItemWriter implements ItemWriter<String> {

    @Override
    public void write(Chunk<? extends String> chunk) {
        // TODO: save to DB later
        System.out.println("Writing items: " + chunk.getItems());
    }
}
