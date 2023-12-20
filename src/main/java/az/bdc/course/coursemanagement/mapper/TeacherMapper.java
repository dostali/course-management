package az.bdc.course.coursemanagement.mapper;

import az.bdc.course.coursemanagement.dto.StudentDto;
import az.bdc.course.coursemanagement.dto.TeacherDto;
import az.bdc.course.coursemanagement.entities.StudentEntity;
import az.bdc.course.coursemanagement.entities.TeacherEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TeacherMapper {

    TeacherMapper INSTANCE = Mappers.getMapper(TeacherMapper.class);

    @Mapping(target = "createDate", ignore = true)
    @Mapping(target = "updateDate", ignore = true)
    TeacherDto toDto(TeacherEntity creditDetails);

    @Mapping(target = "id", ignore = true)
    TeacherEntity toDbo(TeacherDto creditDetails);
}
