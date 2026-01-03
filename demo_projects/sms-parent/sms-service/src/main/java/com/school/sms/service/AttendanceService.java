package com.school.sms.service;

import org.springframework.stereotype.Service;

@Service
public class AttendanceService {

    public String markAttendance() {
        return "ATTENDANCE_MARKED";
    }

    public String getAttendanceReport() {
        return "ATTENDANCE_REPORT";
    }
}
