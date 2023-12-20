package az.bdc.course.coursemanagement.dto;


import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseDto {
    private Long id;

    private String name;

    private String address;

    private String phoneNumber;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;
}
