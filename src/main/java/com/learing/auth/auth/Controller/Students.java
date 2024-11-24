package com.learing.auth.auth.Controller;

import com.learing.auth.auth.Model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class Students {
    List<Student> students = new ArrayList<Student>(List.of(
            new Student("Pollob", 234),
            new Student("Devamrita",432)
    ));

    @GetMapping("/student")
    public List<Student> getStudents() {
        return students;
    }

    @PostMapping("student")
    public Student addStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }

    @GetMapping("/get-csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }


}
