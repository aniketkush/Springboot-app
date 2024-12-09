package com.springboot.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Controller Class
@RestController
public class StudentController {

    // http://localhost:8080/student
    @GetMapping("/student")
    public student getStudent() {
        return new student("Aniket", "Kushwaha");
    }
    @GetMapping("/students")
    public List<student> getStudents(){
    	List<student> Students = new ArrayList<>();
    	Students.add(new student("Aniket", "Kushwaha"));
    	Students.add(new student("Anna", "Kushwaha"));
    	Students.add(new student("Aditya", "jain"));
    	Students.add(new student("kartik", "patel"));
		return Students;
    }
}

