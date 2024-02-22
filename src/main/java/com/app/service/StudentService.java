package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.StudentRepository;
import com.app.entity.Student;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student getStudentById(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student saveStudent(Student admin) {
        return studentRepository.save(admin);
    }

    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }
}

