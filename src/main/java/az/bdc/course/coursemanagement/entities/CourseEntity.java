package az.bdc.course.coursemanagement.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
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
@EqualsAndHashCode
public class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String address;

    private String phoneNumber;

    @OneToMany(mappedBy = "courseId",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<CourseStudentContractEntity> courseStudentContractEntities;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;

    @PrePersist
    private void onCreate() {
        createDate = LocalDateTime.now();
        updateDate = LocalDateTime.now();
    }

    @PreUpdate
    private void onUpdate() {
        updateDate = LocalDateTime.now();
    }
}
