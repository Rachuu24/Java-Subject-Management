package com.example.subjectmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.subjectmanagement.model.Subject;
import com.example.subjectmanagement.repository.SubjectRepository;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository repository;

    public Subject addSubject(Subject subject) {
        return repository.save(subject);
    }

    public List<Subject> getAllSubjects() {
        return repository.findAll();
    }

    public Subject updateSubject(int id, Subject subject) {
        subject.setSubjectCode(id);
        return repository.save(subject);
    }

    public void deleteSubject(int id) {
        repository.deleteById(id);
    }
}
