package com.school.sms.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/documents")
public class DocumentController {

    @PostMapping("/upload")
    public String uploadDocument() {
        return "Document uploaded successfully";
    }

    @GetMapping("/{id}")
    public String getDocument(@PathVariable Long id) {
        return "Document fetched with id " + id;
    }
}
