package com.school.sms.core.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student_documents")
public class StudentDocument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String documentName;

    private String documentType;

    private String filePath;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    /* Getters and Setters */

    public Long getId() {
        return id;
    }

    public String getDocumentName() {
        return documentName;
    }

    public String getDocumentType() {
        return documentType;
    }

    public String getFilePath() {
        return filePath;
    }

    public Student getStudent() {
        return student;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
