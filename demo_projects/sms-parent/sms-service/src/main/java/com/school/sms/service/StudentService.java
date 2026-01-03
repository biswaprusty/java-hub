package com.school.sms.service;

import com.school.sms.common.dto.StudentDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public List<StudentDTO> getAllStudents() {
        StudentDTO s1 = new StudentDTO();
        s1.setId(1L);
        s1.setName("Student A");
        s1.setGrade("5");

        StudentDTO s2 = new StudentDTO();
        s2.setId(2L);
        s2.setName("Student B");
        s2.setGrade("6");

        return List.of(s1, s2);
    }

    public StudentDTO getStudentById(Long id) {
        StudentDTO student = new StudentDTO();
        student.setId(id);
        student.setName("Student " + id);
        student.setGrade("5");
        return student;
    }

    public StudentDTO createStudent(StudentDTO studentDTO) {
        // later we will save to DB
        studentDTO.setId(100L); // dummy id
        return studentDTO;
    }

    public void deleteStudent(Long id) {
        // later we will delete from DB
    }
}
