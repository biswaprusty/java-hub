package com.school.sms.service;

import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    public String createTeacher() {
        return "TEACHER_CREATED";
    }

    public String getTeacherById(Long id) {
        return "TEACHER_FOUND_" + id;
    }
}
