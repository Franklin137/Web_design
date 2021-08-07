package com.sign.controller;

import com.sign.bean.Student;
import com.sign.sevices.CourseService;
import com.sign.sevices.StudentService;
import com.sign.sevices.TeacherService;
import com.sign.sevices.UserService;
import com.sign.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    UserService userService;

    @Autowired
    TeacherService teacherService;

    @Autowired
    CourseService courseService;

    @Autowired
    StudentService studentService;

    @PostMapping("/insert")
    public Result<?> insertStudent(@RequestBody Student student){
        studentService.save(student);
        return Result.success();
    }

}
