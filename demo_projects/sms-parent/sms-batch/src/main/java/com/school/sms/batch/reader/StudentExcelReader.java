package com.school.sms.batch.reader;

import org.springframework.batch.item.ItemReader;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentExcelReader implements ItemReader<String> {

    @Override
    public String read() {
        // TODO: Excel reading logic later
        return null; // returning null ends the batch
    }
}
