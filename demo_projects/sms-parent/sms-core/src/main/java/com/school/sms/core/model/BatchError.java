package com.school.sms.core.model;

import jakarta.persistence.*;

@Entity
@Table(name = "batch_errors")
public class BatchError {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int rowNumber;

    private String errorMessage;

    /* Getters and Setters */

    public Long getId() {
        return id;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
