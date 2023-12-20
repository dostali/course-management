package az.bdc.course.coursemanagement.repository;

import az.bdc.course.coursemanagement.entities.CourseDetailEntity;
import az.bdc.course.coursemanagement.entities.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseDetailRepository extends JpaRepository<CourseDetailEntity, Long> {
    Optional<CourseDetailEntity> findByNameAndSurname(String name, String surname);
}

