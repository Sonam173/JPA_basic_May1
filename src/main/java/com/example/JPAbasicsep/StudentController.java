package com.example.JPAbasicsep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student,@RequestParam("department") Department department)
    {
        return studentService.addStudent(student,department);
    }
    @GetMapping("/get/{id}")
    public Student getStudentById(@PathVariable int id)
    {
        return studentService.getStudentById(id);

    }
    @DeleteMapping("/delete")
    public String deleteStudent(@RequestParam("id") int id)
    {
        return studentService.deleteStudent(id);
    }
}
// get all the students
// delete student by studentId
// delete all students
//find all students age of 20

