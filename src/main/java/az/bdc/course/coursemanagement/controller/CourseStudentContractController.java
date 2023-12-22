package az.bdc.course.coursemanagement.controller;

import az.bdc.course.coursemanagement.dto.CourseStudentContractDto;
import az.bdc.course.coursemanagement.service.CourseStudentContractService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/course-student-contracts")
@RequiredArgsConstructor
public class CourseStudentContractController {

    private final CourseStudentContractService courseStudentContractService;

    @GetMapping
    public ResponseEntity<List<CourseStudentContractDto>> getAll() {
        return ResponseEntity.ok(courseStudentContractService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CourseStudentContractDto> getById(@PathVariable Long id) {
        return ResponseEntity.ok(courseStudentContractService.getById(id));
    }


    @PostMapping
    public ResponseEntity<?> add(@RequestBody CourseStudentContractDto courseStudentContractDto) {
        courseStudentContractService.add(courseStudentContractDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id,
                                    @RequestBody CourseStudentContractDto courseStudentContractDto) {
        courseStudentContractService.update(courseStudentContractDto, id);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id) {
        courseStudentContractService.deleteById(id);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


}

