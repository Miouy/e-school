package kz.springboot.eschool.repository;

import kz.springboot.eschool.model.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentTestRepository {
    @Select("SELECT * FROM students")
    public List<Student> findAll();

    @Select("SELECT * FROM students WHERE id=#{id}")
    public Student findById(Long id);

    @Delete("DELETE FROM students WHERE id = #{id}")
    public int deleteById(Long id);

    @Insert("INSERT INTO students(firstName, lastName, birthDate, email, password) " +
            " VALUES (#{firstName}, #{lastName}, #{birthDate}, #{email}, #{password})")
    public int insert(Student student);

    @Delete("TRUNCATE TABLE #{name}")
    public void truncateTable(String name);

}
