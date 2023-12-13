package az.bdc.course.coursemanagement.dto;

import az.bdc.course.coursemanagement.entities.CourseStudentContractEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

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
