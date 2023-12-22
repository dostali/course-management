package az.bdc.course.coursemanagement.service;

import az.bdc.course.coursemanagement.dto.CourseDetailDto;
import az.bdc.course.coursemanagement.dto.CourseDto;

import java.util.List;

public interface CourseService {


    List<CourseDto> getAll();

    CourseDto getById(long id);

    void add(CourseDto courseDto);

    void update(CourseDto courseDto, long id);

    void update(CourseDetailDto courseDetailDto, long id);

    void deleteById(long id);

}
