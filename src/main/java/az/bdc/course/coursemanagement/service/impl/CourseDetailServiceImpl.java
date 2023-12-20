package az.bdc.course.coursemanagement.service.impl;

import az.bdc.course.coursemanagement.dto.CourseDetailDto;
import az.bdc.course.coursemanagement.entities.CourseDetailEntity;
import az.bdc.course.coursemanagement.exception.CustomerNotFoundException;
import az.bdc.course.coursemanagement.mapper.CourseDetailMapper;
import az.bdc.course.coursemanagement.repository.CourseDetailRepository;
import az.bdc.course.coursemanagement.service.CourseDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class CourseDetailServiceImpl implements CourseDetailService {

    private final CourseDetailRepository repository;
    private final CourseDetailMapper mapper;


    @Override
    public CourseDetailDto getByNameAndSurname(String name, String surname) {
        CourseDetailEntity courseDetailEntity = repository.findByNameAndSurname(name, surname).orElseThrow(
                () -> new CustomerNotFoundException("Məlumat tapilmadi",
                        List.of(name, surname)));
        return mapper.toDto(courseDetailEntity);
    }

    @Override
    public List<CourseDetailDto> getAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public CourseDetailDto getById(long id) {
            CourseDetailEntity courseDetailEntity = repository.findById(id).orElseThrow(
                () -> new CustomerNotFoundException(String.valueOf(id),
                        "Məlumat tapilmadi"));
        return mapper.toDto(courseDetailEntity);
    }

    @Override
    public void add(CourseDetailDto courseDetailDto) {
        CourseDetailEntity courseDetailEntity = mapper.toDbo(courseDetailDto);
        repository.save(courseDetailEntity);
    }

    @Override
    public void update(CourseDetailDto courseDetailDto, long id) {
        CourseDetailEntity courseDetailEntity = repository.findById(id).orElseThrow(
                () -> new CustomerNotFoundException(String.valueOf(id),
                        "Məlumat tapilmadi"));
        courseDetailEntity.setName(courseDetailEntity.getName());
        courseDetailEntity.setAddress(courseDetailEntity.getAddress());
        courseDetailEntity.setPhoneNumber(courseDetailEntity.getPhoneNumber());
        repository.save(courseDetailEntity);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }


}
