package az.bdc.course.coursemanagement.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDto {

    private Long id;

    private String name;

    private String surname;

    private String fullname;

    private LocalDate birthDate;

    private String phoneNumber;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;
}
