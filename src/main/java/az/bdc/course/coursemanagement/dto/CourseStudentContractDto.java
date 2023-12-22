package az.bdc.course.coursemanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    private Long courseId;

    private Long studentId;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;
}
