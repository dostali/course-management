package az.bdc.course.coursemanagement.mapper;

import az.bdc.course.coursemanagement.dto.CourseDetailDto;
import az.bdc.course.coursemanagement.entities.CourseDetailEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
@Mapper
public interface CourseDetailMapper {
    CourseDetailMapper INSTANCE = Mappers.getMapper(CourseDetailMapper.class);


    @Mapping(target = "createDate", ignore = true)
    @Mapping(target = "updateDate", ignore = true)
    CourseDetailDto toDto(CourseDetailEntity courseDetailEntity);

    @Mapping(target = "id", ignore = true)
    CourseDetailEntity toDbo(CourseDetailDto courseDetailDto);
}