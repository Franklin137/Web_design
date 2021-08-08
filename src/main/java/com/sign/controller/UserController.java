package com.sign.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sign.bean.Student;
import com.sign.bean.User;
import com.sign.common.Result;
import com.sign.sevices.CourseService;
import com.sign.sevices.StudentService;
import com.sign.sevices.TeacherService;
import com.sign.sevices.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    TeacherService teacherService;

    @Autowired
    CourseService courseService;

    @Autowired
    StudentService studentService;

    @PostMapping("/login")
    public Result<?> login(@RequestBody User user){
        QueryWrapper<User> userQueryWrapper=new QueryWrapper<>();
        User user1=userService.getOne(userQueryWrapper.eq("username",user.getUsername()));
        if(user1.getPassword().equals(user.getPassword())&&user.getUsertype().equals(user1.getUsertype())){
            return Result.success();
        }else return Result.error("404","用户名或密码错误");
    }


}
