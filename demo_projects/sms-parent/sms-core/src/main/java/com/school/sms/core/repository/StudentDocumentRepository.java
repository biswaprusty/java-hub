package com.school.sms.core.repository;

import com.school.sms.core.model.StudentDocument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDocumentRepository
        extends JpaRepository<StudentDocument, Long> {
}
