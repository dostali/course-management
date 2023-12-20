package az.bdc.course.coursemanagement.mapper;

import az.bdc.course.coursemanagement.dto.CourseDetailDto;
import az.bdc.course.coursemanagement.dto.CourseDto;
import az.bdc.course.coursemanagement.dto.StudentDto;
import az.bdc.course.coursemanagement.entities.CourseDetailEntity;
import az.bdc.course.coursemanagement.entities.CourseEntity;
import az.bdc.course.coursemanagement.entities.StudentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
@Mapper

public interface CourseMapper {
    CourseMapper INSTANCE = Mappers.getMapper(CourseMapper.class);


    @Mapping(target = "createDate", ignore = true)
    @Mapping(target = "updateDate", ignore = true)
    CourseDto toDto(CourseEntity courseEntity);

    @Mapping(target = "id", ignore = true)
    CourseEntity toDbo(CourseDto courseDto);
}