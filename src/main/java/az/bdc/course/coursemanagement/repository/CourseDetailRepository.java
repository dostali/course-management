package az.bdc.course.coursemanagement.repository;

import az.bdc.course.coursemanagement.entities.CourseDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDetailRepository extends JpaRepository<CourseDetailEntity, Long> {
}
