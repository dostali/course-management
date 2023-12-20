package az.bdc.course.coursemanagement.service.impl;

import az.bdc.course.coursemanagement.dto.TeacherDto;
import az.bdc.course.coursemanagement.entities.TeacherEntity;
import az.bdc.course.coursemanagement.exception.CustomerNotFoundException;
import az.bdc.course.coursemanagement.mapper.TeacherMapper;
import az.bdc.course.coursemanagement.repository.TeacherRepository;
import az.bdc.course.coursemanagement.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository repository;
    private final TeacherMapper mapper;


    @Override
    public TeacherDto getByNameAndSurname(String name, String surname) {
        TeacherEntity teacherEntity = repository.findByNameAndSurname(name, surname).orElseThrow(
                () -> new CustomerNotFoundException("Məlumat tapilmadi",
                        List.of(name, surname)));
        return mapper.toDto(teacherEntity);
    }

    @Override
    public List<TeacherDto> getAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public TeacherDto getById(long id) {
        TeacherEntity teacherEntity = repository.findById(id).orElseThrow(
                () -> new CustomerNotFoundException(String.valueOf(id),
                        "Məlumat tapilmadi"));
        return mapper.toDto(teacherEntity);
    }

    @Override
    public void add(TeacherDto teacherDto) {
        TeacherEntity teacherEntity = mapper.toDbo(teacherDto);
        repository.save(teacherEntity);
    }

    @Override
    public void update(TeacherDto teacherDto, long id) {
        TeacherEntity teacherEntity = repository.findById(id).orElseThrow(
                () -> new CustomerNotFoundException(String.valueOf(id),
                        "Məlumat tapilmadi"));
        teacherEntity.setName(teacherDto.getName());
        teacherEntity.setFullname(teacherDto.getFullname());
        teacherEntity.setSurname(teacherDto.getSurname());
        teacherEntity.setBirthDate(teacherDto.getBirthDate());
        repository.save(teacherEntity);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }


}
