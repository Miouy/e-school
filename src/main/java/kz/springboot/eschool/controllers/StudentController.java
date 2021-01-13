package kz.springboot.eschool.controllers;

import kz.springboot.eschool.model.Student;
import kz.springboot.eschool.repository.StudentMyBatisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentMyBatisRepository studentMyBatisRepository;

    @GetMapping("")
    public List<Student> getStudent(){
        return studentMyBatisRepository.findAll();
    }

    @PostMapping("/add")
    public void addStudent(@RequestBody Student student){
        studentMyBatisRepository.insert(student);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentMyBatisRepository.deleteById(id);
    }
}
