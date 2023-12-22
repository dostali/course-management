package az.bdc.course.coursemanagement.service;

import az.bdc.course.coursemanagement.dto.StudentDto;
import az.bdc.course.coursemanagement.entities.StudentEntity;

import java.util.List;

public interface StudentService {

    List<StudentDto> getByNameAndSurname(String name, String surname);

    List<StudentDto> getAll();

    StudentDto getById(long id);

    void add(StudentDto studentDto);

    void update(StudentDto studentDto, long id);

    void deleteById(long id);

}
