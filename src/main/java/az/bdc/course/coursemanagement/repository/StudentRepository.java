package az.bdc.course.coursemanagement.repository;

import az.bdc.course.coursemanagement.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}
