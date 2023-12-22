package az.bdc.course.coursemanagement.service;

import az.bdc.course.coursemanagement.dto.CourseDetailDto;
import az.bdc.course.coursemanagement.dto.StudentDto;

import java.util.List;

public interface CourseDetailService {

    List<CourseDetailDto> getAll();

    CourseDetailDto getById(long id);

    void add(CourseDetailDto courseDetailDto);

    void update(CourseDetailDto courseDetailDto, long id);

    void deleteById(long id);
}
