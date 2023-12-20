package az.bdc.course.coursemanagement.mapper;

import az.bdc.course.coursemanagement.dto.StudentDto;
import az.bdc.course.coursemanagement.dto.SubjectDto;
import az.bdc.course.coursemanagement.entities.StudentEntity;
import az.bdc.course.coursemanagement.entities.SubjectEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
@Mapper

public interface SubjectMapper {
    SubjectMapper INSTANCE = Mappers.getMapper(SubjectMapper.class);


    @Mapping(target = "createDate", ignore = true)
    @Mapping(target = "updateDate", ignore = true)
    SubjectDto toDto(SubjectEntity subjectEntity);

    @Mapping(target = "id", ignore = true)
    SubjectEntity toDbo(SubjectDto subjectDto);
}
