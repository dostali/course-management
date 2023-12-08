package az.bdc.course.coursemanagement.repository;

import az.bdc.course.coursemanagement.entities.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<TeacherEntity, Long> {
}
