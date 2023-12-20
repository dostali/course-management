package az.bdc.course.coursemanagement.service;

import az.bdc.course.coursemanagement.dto.CourseDto;
import az.bdc.course.coursemanagement.dto.SubjectDto;

import java.util.List;

public interface SubjectService {
    List<SubjectDto> getAll();

    SubjectDto getById(long id);

    void add(SubjectDto subjectDto);

    void update(SubjectDto subjectDto, long id);

    void deleteById(long id);
}
