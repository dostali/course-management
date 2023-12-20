package az.bdc.course.coursemanagement.mapper;

import az.bdc.course.coursemanagement.dto.CourseStudentContractDto;
import az.bdc.course.coursemanagement.dto.StudentDto;
import az.bdc.course.coursemanagement.entities.CourseStudentContractEntity;
import az.bdc.course.coursemanagement.entities.StudentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
@Mapper

public interface CourseStudentMapper {
    CourseStudentMapper INSTANCE = Mappers.getMapper(CourseStudentMapper.class);


    @Mapping(target = "createDate", ignore = true)
    @Mapping(target = "updateDate", ignore = true)
    CourseStudentContractDto toDto(CourseStudentContractEntity courseStudentContractEntity);

    @Mapping(target = "id", ignore = true)
    CourseStudentContractEntity toDbo(CourseStudentContractDto courseStudentContractDto);
}
