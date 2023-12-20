package az.bdc.course.coursemanagement.service;

import az.bdc.course.coursemanagement.dto.CourseDto;
import az.bdc.course.coursemanagement.dto.CourseStudentContractDto;

import java.util.List;

public interface CourseStudentContractService {
    List<CourseStudentContractDto> getAll();

    CourseStudentContractDto getById(long id);

    void add(CourseStudentContractDto courseStudentContractDto);

    void update(CourseStudentContractDto courseStudentContractDto, long id);

    void deleteById(long id);
}
