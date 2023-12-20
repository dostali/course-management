package az.bdc.course.coursemanagement.dto;


import lombok.*;

import java.sql.Date;
import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TeacherDto {

    private Long id;

    private String name;

    private String surname;

    private String fullname;

    private Date birthDate;

    private String phoneNumber;

    private String pincode;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;
}
