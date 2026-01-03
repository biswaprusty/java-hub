package com.school.sms.batch.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BatchJobListener implements JobExecutionListener {

    @Override
    public void beforeJob(JobExecution jobExecution) {
        System.out.println("Batch job started");
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        System.out.println("Batch job finished with status: " +
                jobExecution.getStatus());
    }
}
