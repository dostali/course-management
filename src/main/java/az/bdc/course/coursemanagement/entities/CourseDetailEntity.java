package az.bdc.course.coursemanagement.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "COURSE_DETAIL", schema = "course_management", catalog = "")
public class CourseDetailEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToOne
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    private CourseEntity courseEntity;

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
