package com.sign.controller;

import com.sign.sevices.CourseService;
import com.sign.sevices.StudentService;
import com.sign.sevices.TeacherService;
import com.sign.sevices.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LoginController {
    @Autowired
    UserService userService;

    @Autowired
    TeacherService teacherService;

    @Autowired
    CourseService courseService;

    @Autowired
    StudentService studentService;



}
