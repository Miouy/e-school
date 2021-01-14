package kz.springboot.eschool.service;

import kz.springboot.eschool.repository.StudentTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@SpringBootTest
public class StudentServiceTest extends AbstractTestNGSpringContextTests {

    @Autowired
    StudentTestRepository studentTestRepository;

    @Test
    void studentTest(){
        studentTestRepository.truncateTable("students");
    }
}
