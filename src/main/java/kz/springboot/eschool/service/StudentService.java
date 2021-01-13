package kz.springboot.eschool.service;

import kz.springboot.eschool.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAll();
    Student getStudent(Long id);
    void deleteStudent(Long id);
    void addStudent(Student student);
}
