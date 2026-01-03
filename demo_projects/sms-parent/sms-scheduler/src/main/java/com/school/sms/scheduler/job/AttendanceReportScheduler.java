package com.school.sms.scheduler.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class AttendanceReportScheduler {

    /**
     * Runs every day at 10 PM
     * Cron format: second minute hour day month weekday
     */
    @Scheduled(cron = "0 0 22 * * ?")
    public void generateDailyAttendanceReport() {

        System.out.println(
                "[SCHEDULER] Generating daily attendance report at "
                        + LocalDateTime.now()
        );

        // TODO later:
        // 1. Fetch attendance from DB
        // 2. Generate PDF / Excel
        // 3. Publish Kafka event
        // 4. Save audit log
    }
}
