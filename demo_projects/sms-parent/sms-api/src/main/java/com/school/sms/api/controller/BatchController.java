package com.school.sms.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/batch")
public class BatchController {

    @PostMapping("/student-upload")
    public String uploadStudentExcel() {
        // Spring Batch Job will be triggered later
        return "Student batch job triggered";
    }
}
