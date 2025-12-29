package com.example.subjectmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.subjectmanagement.model.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}
