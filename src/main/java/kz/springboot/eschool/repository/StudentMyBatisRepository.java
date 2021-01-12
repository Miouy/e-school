package kz.springboot.eschool.repository;

import kz.springboot.eschool.model.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMyBatisRepository {

    @Select("SELECT * FROM students")
    public List<Student> findAll();

    @Select("SELECT * FROM students WHERE id=#{id}")
    public Student findById(Long id);

    @Delete("DELETE FROM students WHERE id = #{id}")
    public int deleteById(long id);

    @Insert("INSERT INTO students(firstName, lastName, birthDate, email, password) " +
            " VALUES (#{firstName}, #{lastName}, #{birthDate}, #{email}, #{password})")
    public int insert(Student student);
}
