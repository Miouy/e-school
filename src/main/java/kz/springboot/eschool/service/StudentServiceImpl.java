package kz.springboot.eschool.service;

import kz.springboot.eschool.model.Student;
import kz.springboot.eschool.repository.StudentMyBatisRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMyBatisRepository studentMyBatisRepository;

    @Override
    public List<Student> getAll() {
        return studentMyBatisRepository.findAll();
    }

    @Override
    public Student getStudent(Long id) {
        return studentMyBatisRepository.findById(id);
    }

    @Override
    public void deleteStudent(Long id) {
        studentMyBatisRepository.deleteById(id);
    }

    @Override
    public void addStudent(Student student) {
        studentMyBatisRepository.insert(student);
    }
}
