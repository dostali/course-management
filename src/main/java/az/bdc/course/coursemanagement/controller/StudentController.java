package az.bdc.course.coursemanagement.controller;


import az.bdc.course.coursemanagement.dto.StudentDto;
import az.bdc.course.coursemanagement.service.StudentService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<List<StudentDto>> getAll(){
        return ResponseEntity.ok(studentService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getAllById(@PathVariable long id){
        return ResponseEntity.ok(studentService.getById(id));
    }

    @GetMapping("/name-surname")
    public ResponseEntity<StudentDto> getAllByNameAndSurname(@RequestParam String name, @RequestParam String surname){
        return ResponseEntity.ok(studentService.getByNameAndSurname(name, surname));
    }


    @PostMapping
    public ResponseEntity<?> add(@RequestBody StudentDto studentDto){
         studentService.add(studentDto);
         return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody StudentDto studentDto, @PathVariable long id){
        studentService.update(studentDto, id);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<?> update(@PathVariable long id){
        studentService.deleteById(id);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
