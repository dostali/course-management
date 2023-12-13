package az.bdc.course.coursemanagement.mapper;

import az.bdc.course.coursemanagement.dto.StudentDto;
import az.bdc.course.coursemanagement.entities.StudentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);


    @Mapping(target = "createDate", ignore = true)
    @Mapping(target = "updateDate", ignore = true)
    StudentDto toDto(StudentEntity creditDetails);

    @Mapping(target = "id", ignore = true)
    StudentEntity toDbo(StudentDto creditDetails);
}
