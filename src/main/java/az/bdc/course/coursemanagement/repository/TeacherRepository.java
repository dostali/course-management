package az.bdc.course.coursemanagement.repository;

import az.bdc.course.coursemanagement.entities.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TeacherRepository extends JpaRepository<TeacherEntity, Long> {
    Optional<TeacherEntity> findByNameAndSurname(String name, String surname);
}
