package com.school.sms.api.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @GetMapping
    public List<String> getAllTeachers() {
        return List.of("Teacher X", "Teacher Y");
    }

    @PostMapping
    public String addTeacher(@RequestBody String teacher) {
        return "Teacher added: " + teacher;
    }
}
