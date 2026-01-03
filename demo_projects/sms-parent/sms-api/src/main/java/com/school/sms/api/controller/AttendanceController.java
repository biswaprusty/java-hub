package com.school.sms.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {

    @PostMapping("/mark")
    public String markAttendance(
            @RequestParam Long studentId,
            @RequestParam String status
    ) {
        return "Attendance marked for student " + studentId + " as " + status;
    }

    @GetMapping("/{studentId}")
    public String getAttendance(@PathVariable Long studentId) {
        return "Attendance details for student " + studentId;
    }
}
