package com.school.sms.core.repository;

import com.school.sms.core.model.BatchError;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BatchErrorRepository extends JpaRepository<BatchError, Long> {
}
