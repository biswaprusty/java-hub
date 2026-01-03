package com.school.sms.pdf.service;

import org.springframework.stereotype.Service;

@Service
public class PdfValidationService {

    public boolean isValidPdf(String fileName) {
        return fileName != null && fileName.toLowerCase().endsWith(".pdf");
    }

    public void validateOrThrow(String fileName) {
        if (!isValidPdf(fileName)) {
            throw new IllegalArgumentException("Invalid PDF file");
        }
    }
}
