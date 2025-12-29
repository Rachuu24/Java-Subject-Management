package com.example.subjectmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.subjectmanagement.model.Subject;
import com.example.subjectmanagement.service.SubjectService;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

    @Autowired
    private SubjectService service;

    @PostMapping
    public Subject createSubject(@RequestBody Subject subject) {
        return service.addSubject(subject);
    }

    @GetMapping
    public List<Subject> getAllSubjects() {
        return service.getAllSubjects();
    }

    @PutMapping("/{id}")
    public Subject updateSubject(@PathVariable int id,
                                 @RequestBody Subject subject) {
        return service.updateSubject(id, subject);
    }

    @DeleteMapping("/{id}")
    public String deleteSubject(@PathVariable int id) {
        service.deleteSubject(id);
        return "Subject deleted successfully";
    }
}
