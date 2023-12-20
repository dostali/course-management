package az.bdc.course.coursemanagement.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubjectDto {
    private Long id;

    private String name;

    private String type;

    private String kind;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;
}
