package az.bdc.course.coursemanagement.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "COURSE")
public class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String address;

    private String phoneNumber;

    @OneToMany(mappedBy = "courseEntity",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<CourseStudentContractEntity> courseStudentContractEntities;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;
}
