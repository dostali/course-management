package az.bdc.course.coursemanagement.service;

import az.bdc.course.coursemanagement.dto.StudentDto;
import az.bdc.course.coursemanagement.dto.TeacherDto;

import java.util.List;

public interface TeacherService {

    TeacherDto getByNameAndSurname(String name, String surname);

    List<TeacherDto> getAll();

    TeacherDto getById(long id);

    void add(TeacherDto teacherDto);

    void update(TeacherDto teacherDto, long id);

    void deleteById(long id);

}
