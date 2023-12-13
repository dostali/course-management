package az.bdc.course.coursemanagement.repository;

import az.bdc.course.coursemanagement.entities.CourseDetailsEntity;
import az.bdc.course.coursemanagement.entities.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDetailsRepository  extends JpaRepository<CourseDetailsEntity, Long> {
}
