package az.bdc.course.coursemanagement.repository;

import az.bdc.course.coursemanagement.entities.SubjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<SubjectEntity, Long> {
}
