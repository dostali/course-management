package az.bdc.course.coursemanagement.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "COURSE_STUDENT_CONTRACT")
public class CourseStudentContractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal monthlyAmount;

    private BigDecimal totalAmount;

    private LocalDate contractDate;

    @ManyToOne(fetch = FetchType.LAZY)
    private CourseEntity courseEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    private StudentEntity studentEntity;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;
}
