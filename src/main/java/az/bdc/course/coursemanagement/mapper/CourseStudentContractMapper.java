package az.bdc.course.coursemanagement.mapper;

import az.bdc.course.coursemanagement.dto.CourseStudentContractDto;
import az.bdc.course.coursemanagement.entities.CourseStudentContractEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
@Mapper(componentModel = "spring")
public interface CourseStudentContractMapper {
    CourseStudentContractMapper INSTANCE = Mappers.getMapper(CourseStudentContractMapper.class);



    @Mapping(target = "studentId", source = "courseStudentContractEntity.studentId.id")
    @Mapping(target = "courseId", source = "courseStudentContractEntity.courseId.id")
    CourseStudentContractDto toDto(CourseStudentContractEntity courseStudentContractEntity);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "studentId", ignore = true)
    @Mapping(target = "courseId", ignore = true)
    @Mapping(target = "createDate", ignore = true)
    @Mapping(target = "updateDate", ignore = true)
    CourseStudentContractEntity toDbo(CourseStudentContractDto courseStudentContractDto);
}
