package az.bdc.course.coursemanagement.dto;


import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentMonthlyPaymentDto {
    private Long id;

    private BigDecimal amount;

    private LocalDateTime paymentDate;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;
}
