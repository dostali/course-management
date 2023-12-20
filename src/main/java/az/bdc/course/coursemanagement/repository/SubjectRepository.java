package az.bdc.course.coursemanagement.repository;

import az.bdc.course.coursemanagement.entities.CourseEntity;
import az.bdc.course.coursemanagement.entities.SubjectEntity;
import az.bdc.course.coursemanagement.entities.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SubjectRepository extends JpaRepository<SubjectEntity, Long> {
    Optional<TeacherEntity> findByNameAndSurname(String name, String surname);
}

