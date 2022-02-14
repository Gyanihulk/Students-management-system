package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import services.StudentService;

@RestController
public class Studentcontroller {
    @GetMapping("/test")
    public String test(){
        return "test";
    }



    // handler method to handle list students and return mode and view
    @GetMapping("/students")
    public String listStudents() {
        return "students";

}}
