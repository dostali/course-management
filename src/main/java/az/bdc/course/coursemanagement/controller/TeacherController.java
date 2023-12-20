package az.bdc.course.coursemanagement.controller;


import az.bdc.course.coursemanagement.dto.TeacherDto;
import az.bdc.course.coursemanagement.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
@RequiredArgsConstructor
public class TeacherController {

    private final TeacherService teacherService;

    @GetMapping
    public ResponseEntity<List<TeacherDto>> getAll(){
        return ResponseEntity.ok(teacherService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TeacherDto> getAllById(@PathVariable long id){
        return ResponseEntity.ok(teacherService.getById(id));
    }
    @GetMapping("/name-surname")
    public ResponseEntity<TeacherDto> getAllByNameAndSurname(@RequestParam String name, @RequestParam String surname){
        return ResponseEntity.ok(teacherService.getByNameAndSurname(name, surname));
    }

    @PostMapping
    public ResponseEntity<?> add(@RequestBody TeacherDto teacherDto){
         teacherService.add(teacherDto);
         return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody TeacherDto teacherDto, @PathVariable long id){
        teacherService.update(teacherDto, id);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<?> update(@PathVariable long id){
        teacherService.deleteById(id);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
