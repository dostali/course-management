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
@Table(name = "COURSE_DETAILS", schema = "course_management", catalog = "")
public class CourseDetailsEntity {

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

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "course_entity_id")
    private CourseEntity courseEntity;

}
