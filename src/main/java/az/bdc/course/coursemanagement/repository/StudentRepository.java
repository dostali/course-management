package az.bdc.course.coursemanagement.repository;

import az.bdc.course.coursemanagement.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

    Optional<StudentEntity> findByNameAndSurname(String name, String surname);
}
