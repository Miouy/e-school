package kz.springboot.eschool.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentForTest {
    private Long id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String email;
    private String password;

}
