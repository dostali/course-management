package az.bdc.course.coursemanagement.dto;

import az.bdc.course.coursemanagement.entities.CourseEntity;
import az.bdc.course.coursemanagement.entities.StudentEntity;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseStudentContractDto {
    private Long id;

    private BigDecimal monthlyAmount;

    private BigDecimal totalAmount;

    private LocalDate contractDate;

    private CourseEntity courseId;

    private StudentEntity studentId;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;
}
