package com.xyz.controller;

import com.xyz.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

    @Autowired
    private Teacher teacher;

    @RequestMapping("/teacher")
    public String teacher() {
       return "teacher:" + teacher;
    }
}
