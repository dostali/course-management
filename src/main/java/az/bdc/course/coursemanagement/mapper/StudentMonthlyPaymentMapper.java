package az.bdc.course.coursemanagement.mapper;

import az.bdc.course.coursemanagement.dto.StudentDto;
import az.bdc.course.coursemanagement.dto.StudentMonthlyPaymentDto;
import az.bdc.course.coursemanagement.entities.StudentEntity;
import az.bdc.course.coursemanagement.entities.StudentMonthlyPaymentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
@Mapper

public interface StudentMonthlyPaymentMapper {
    StudentMonthlyPaymentMapper INSTANCE = Mappers.getMapper(StudentMonthlyPaymentMapper.class);


    @Mapping(target = "createDate", ignore = true)
    @Mapping(target = "updateDate", ignore = true)
    StudentMonthlyPaymentDto toDto(StudentMonthlyPaymentEntity studentMonthlyPaymentEntity);

    @Mapping(target = "id", ignore = true)
    StudentMonthlyPaymentDto toDbo(StudentMonthlyPaymentDto studentMonthlyPaymentDto);
}
