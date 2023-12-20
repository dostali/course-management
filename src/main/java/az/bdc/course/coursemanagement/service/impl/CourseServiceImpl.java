package az.bdc.course.coursemanagement.service.impl;

import az.bdc.course.coursemanagement.dto.CourseDetailDto;
import az.bdc.course.coursemanagement.dto.CourseDto;
import az.bdc.course.coursemanagement.entities.CourseEntity;
import az.bdc.course.coursemanagement.exception.CustomerNotFoundException;
import az.bdc.course.coursemanagement.mapper.CourseMapper;
import az.bdc.course.coursemanagement.repository.CourseRepository;
import az.bdc.course.coursemanagement.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepository repository;
    private final CourseMapper mapper;


    @Override
    public CourseDto getByNameAndSurname(String name, String surname) {
        CourseEntity courseEntity = repository.findByNameAndSurname(name, surname).orElseThrow(
                () -> new CustomerNotFoundException("Məlumat tapilmadi",
                        List.of(name, surname)));
        return mapper.toDto(courseEntity);
    }

    @Override
    public List<CourseDto> getAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public CourseDto getById(long id) {
        CourseEntity courseEntity = repository.findById(id).orElseThrow(
                () -> new CustomerNotFoundException(String.valueOf(id),
                        "Məlumat tapilmadi"));
        return mapper.toDto(courseEntity);
    }

    @Override
    public void add(CourseDto courseDto) {
        CourseEntity courseEntity = mapper.toDbo(courseDto);
        repository.save(courseEntity);
    }

    @Override
    public void update(CourseDto courseDto, long id) {
        CourseEntity courseEntity = repository.findById(id).orElseThrow(
                () -> new CustomerNotFoundException(String.valueOf(id),
                        "Məlumat tapilmadi"));
        courseEntity.setName(courseDto.getName());
        courseEntity.setAddress(courseDto.getAddress());
        courseEntity.setPhoneNumber(courseDto.getPhoneNumber());
        repository.save(courseEntity);
    }

    @Override
    public void update(CourseDetailDto courseDetailDto, long id) {

    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }


}
