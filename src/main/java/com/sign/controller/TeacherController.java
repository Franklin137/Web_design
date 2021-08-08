package com.sign.controller;

import com.sign.bean.Course;
import com.sign.common.IP;
import com.sign.sevices.CourseService;
import com.sign.sevices.StudentService;
import com.sign.sevices.TeacherService;
import com.sign.sevices.UserService;
import com.sign.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@RestController
public class TeacherController {
    @Autowired
    UserService userService;

    @Autowired
    TeacherService teacherService;

    @Autowired
    CourseService courseService;

    @Autowired
    StudentService studentService;

    @PostMapping("/insertCourse")
    public Result<?> insertCourse(HttpServletRequest request,@RequestBody Course course){
        String ip=IP.getIP(request);
        System.out.println(ip);
        courseService.save(course);
        return Result.success();
    }

    @PostMapping("/removeCourse")
    public Result<?> removeCourse(@RequestBody Course course){
        courseService.save(course);
        return Result.success();
    }

    @PostMapping("/selectCourse")
    public Result<?> selectCourse(@RequestBody Course course){
        courseService.save(course);
        return Result.success();
    }


}
