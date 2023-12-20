package az.bdc.course.coursemanagement.dto;

import az.bdc.course.coursemanagement.entities.CourseEntity;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class CourseDetailDto {
    private Long id;

    private String name;

    private String address;

    private String phoneNumber;

    private CourseEntity courseEntity;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;

}
