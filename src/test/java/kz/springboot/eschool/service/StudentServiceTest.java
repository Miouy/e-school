package kz.springboot.eschool.service;

import kz.springboot.eschool.model.Student;
import kz.springboot.eschool.model.StudentForTest;
import kz.springboot.eschool.repository.StudentTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Test
@ContextConfiguration(locations = { "classpath:spring-test-config.xml" })
public class StudentServiceTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private StudentTestRepository studentTestRepository;

    @Autowired
    private StudentService studentService;

    @Test
    void studentTest(){
        studentTestRepository.truncateTable("students");

        StudentForTest student = new StudentForTest(1L,"Username","Password","1/1/2000","email@test.com","password");
        studentTestRepository.insert(student);

        Student studentFromDb = studentService.getStudent(student.getId());

        assertThat(studentFromDb.getFirstName()).isEqualTo(student.getFirstName());
        assertThat(studentFromDb.getLastName()).isEqualTo(student.getLastName());
        assertThat(studentFromDb.getBirthDate()).isEqualTo(student.getBirthDate());
        assertThat(studentFromDb.getEmail()).isEqualTo(student.getEmail());
        assertThat(studentFromDb.getPassword()).isEqualTo(student.getPassword());
    }
}
