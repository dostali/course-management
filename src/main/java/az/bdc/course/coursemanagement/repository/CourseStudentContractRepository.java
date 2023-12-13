package az.bdc.course.coursemanagement.repository;

import az.bdc.course.coursemanagement.entities.CourseStudentContractEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseStudentContractRepository extends JpaRepository<CourseStudentContractEntity, Long> {
}
