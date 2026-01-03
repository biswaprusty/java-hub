package com.school.sms.common.dto;

import java.time.LocalDate;

public class StudentDTO {

    private Long id;
    private String name;
    private LocalDate dateOfBirth;
    private String grade;
    private Long userId;   // ✅ REQUIRED

    public Long getId() { return id; }
    public String getName() { return name; }
    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public String getGrade() { return grade; }
    public Long getUserId() { return userId; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public void setGrade(String grade) { this.grade = grade; }
    public void setUserId(Long userId) { this.userId = userId; }
}
