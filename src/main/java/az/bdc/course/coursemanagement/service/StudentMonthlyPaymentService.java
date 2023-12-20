package az.bdc.course.coursemanagement.service;

import az.bdc.course.coursemanagement.dto.CourseDto;
import az.bdc.course.coursemanagement.dto.StudentMonthlyPaymentDto;

import java.util.List;

public interface StudentMonthlyPaymentService {
    List<StudentMonthlyPaymentDto> getAll();

    StudentMonthlyPaymentDto getById(long id);

    void add(StudentMonthlyPaymentDto studentMonthlyPaymentDto);

    void update(StudentMonthlyPaymentDto studentMonthlyPaymentDto, long id);

    void deleteById(long id);
}
