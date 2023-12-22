package az.bdc.course.coursemanagement.repository;

import az.bdc.course.coursemanagement.entities.CourseEntity;
import az.bdc.course.coursemanagement.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseRepository extends JpaRepository<CourseEntity, Long> {
}
