package kz.springboot.eschool.repository;

import kz.springboot.eschool.model.StudentForTest;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StudentTestRepository {

    @Insert("INSERT INTO students(id, firstName, lastName, birthDate, email, password) " +
            " VALUES (#{id}, #{firstName}, #{lastName}, #{birthDate}, #{email}, #{password})")
    public int insert(StudentForTest student);

    @Delete("TRUNCATE TABLE ${name}")
    public void truncateTable(String name);

}
