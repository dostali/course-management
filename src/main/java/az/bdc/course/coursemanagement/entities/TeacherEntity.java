package az.bdc.course.coursemanagement.entities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "TEACHER", schema = "course_management", catalog = "")
public class TeacherEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "pincode")
    private String pincode;

    @Column(name = "create_date")
    private LocalDateTime createDate;

    @Column(name = "update_date")
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
