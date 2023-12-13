package az.bdc.course.coursemanagement.service.impl;

import az.bdc.course.coursemanagement.dto.StudentDto;
import az.bdc.course.coursemanagement.entities.StudentEntity;
import az.bdc.course.coursemanagement.exception.CustomerNotFoundException;
import az.bdc.course.coursemanagement.mapper.StudentMapper;
import az.bdc.course.coursemanagement.repository.StudentRepository;
import az.bdc.course.coursemanagement.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;
    private final StudentMapper mapper;


    @Override
    public StudentDto getByNameAndSurname(String name, String surname) {
        StudentEntity studentEntity = repository.findByNameAndSurname(name, surname).orElseThrow(
                () -> new CustomerNotFoundException("Məlumat tapilmadi",
                        List.of(name, surname)));
        return mapper.toDto(studentEntity);
    }

    @Override
    public List<StudentDto> getAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public StudentDto getById(long id) {
        StudentEntity studentEntity = repository.findById(id).orElseThrow(
                () -> new CustomerNotFoundException(String.valueOf(id),
                        "Məlumat tapilmadi"));
        return mapper.toDto(studentEntity);
    }

    @Override
    public void add(StudentDto studentDto) {
        StudentEntity studentEntity = mapper.toDbo(studentDto);
        repository.save(studentEntity);
    }

    @Override
    public void update(StudentDto studentDto, long id) {
        StudentEntity studentEntity = repository.findById(id).orElseThrow(
                () -> new CustomerNotFoundException(String.valueOf(id),
                        "Məlumat tapilmadi"));
        studentEntity.setName(studentDto.getName());
        studentEntity.setFullname(studentDto.getFullname());
        studentEntity.setSurname(studentDto.getSurname());
        studentEntity.setBirthDate(studentDto.getBirthDate());
        repository.save(studentEntity);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }


}
