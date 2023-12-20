package az.bdc.course.coursemanagement.repository;

import az.bdc.course.coursemanagement.entities.CourseEntity;
import az.bdc.course.coursemanagement.entities.CourseStudentContractEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseStudentContractRepository extends JpaRepository<CourseStudentContractEntity, Long> {
    Optional<CourseStudentContractEntity> findByNameAndSurname(String name, String surname);
}
