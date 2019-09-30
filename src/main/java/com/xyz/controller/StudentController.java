package com.xyz.controller;

import com.xyz.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@RestController是Spring4之后引入的新注解，等于@ResponseBody+@Controller
public class StudentController {

    @Autowired
    private Student student;

    @RequestMapping("/student")
    public String student() {
        return "student:" + student;
    }
}
