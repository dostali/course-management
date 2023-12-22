package az.bdc.course.coursemanagement.service.impl;

import az.bdc.course.coursemanagement.dto.CourseStudentContractDto;
import az.bdc.course.coursemanagement.entities.CourseEntity;
import az.bdc.course.coursemanagement.entities.CourseStudentContractEntity;
import az.bdc.course.coursemanagement.entities.StudentEntity;
import az.bdc.course.coursemanagement.exception.DataNotFoundException;
import az.bdc.course.coursemanagement.mapper.CourseStudentContractMapper;
import az.bdc.course.coursemanagement.repository.CourseRepository;
import az.bdc.course.coursemanagement.repository.CourseStudentContractRepository;
import az.bdc.course.coursemanagement.repository.StudentRepository;
import az.bdc.course.coursemanagement.service.CourseStudentContractService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CourseStudentContractServiceImpl implements CourseStudentContractService {

    private final CourseStudentContractRepository repository;

    private final StudentRepository studentRepository;

    private final CourseRepository courseRepository;

    private final CourseStudentContractMapper mapper;


    @Override
    public List<CourseStudentContractDto> getAll() {
        return repository.findAll().stream().map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public CourseStudentContractDto getById(long id) {
        CourseStudentContractEntity courseStudentContractEntity = repository.findById(id).orElseThrow(() -> new DataNotFoundException(id));
        return mapper.toDto(courseStudentContractEntity);
    }


    @Override
    public void add(CourseStudentContractDto courseStudentContractDto) {
        CourseEntity courseEntity = courseRepository.findById(courseStudentContractDto.getCourseId())
                .orElseThrow(() -> new DataNotFoundException(courseStudentContractDto.getCourseId()));

        StudentEntity studentEntity = studentRepository.findById(courseStudentContractDto.getStudentId())
                .orElseThrow(() -> new DataNotFoundException(courseStudentContractDto.getStudentId()));

        CourseStudentContractEntity courseStudentContractEntity = mapper.toDbo(courseStudentContractDto);

        courseStudentContractEntity.setCourseId(courseEntity);
        courseStudentContractEntity.setStudentId(studentEntity);

        repository.save(courseStudentContractEntity);

    }

    @Override
    public void update(CourseStudentContractDto courseStudentContractDto, long id) {
        CourseStudentContractEntity courseStudentContractEntity = repository.findById(id)
                .orElseThrow(() -> new DataNotFoundException(id));

        CourseEntity courseEntity = courseRepository.findById(courseStudentContractDto.getCourseId())
                .orElseThrow(() -> new DataNotFoundException(courseStudentContractDto.getCourseId()));

        StudentEntity studentEntity = studentRepository.findById(courseStudentContractDto.getStudentId())
                .orElseThrow(() -> new DataNotFoundException(courseStudentContractDto.getStudentId()));

        courseStudentContractEntity.setMonthlyAmount(courseStudentContractDto.getMonthlyAmount());
        courseStudentContractEntity.setTotalAmount(courseStudentContractDto.getTotalAmount());
        courseStudentContractEntity.setStudentId(studentEntity);
        courseStudentContractEntity.setCourseId(courseEntity);
        courseStudentContractEntity.setContractDate(courseStudentContractDto.getContractDate());

        repository.save(courseStudentContractEntity);
    }

    @Override
    public void deleteById(long id) {
        CourseStudentContractEntity courseStudentContractEntity = repository.findById(id).orElseThrow(() -> new DataNotFoundException(id));
        repository.delete(courseStudentContractEntity);
    }
}
