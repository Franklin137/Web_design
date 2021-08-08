package com.sign.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sign.bean.Student;
import com.sign.bean.VO.ScVO;
import com.sign.mapper.ScMapper;
import com.sign.sevices.CourseService;
import com.sign.sevices.StudentService;
import com.sign.sevices.TeacherService;
import com.sign.sevices.UserService;
import com.sign.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    UserService userService;

    @Autowired
    TeacherService teacherService;

    @Autowired
    CourseService courseService;

    @Autowired
    StudentService studentService;

    @Autowired
    ScMapper scMapper;

    @PostMapping("/getStudentCourse")
    public Result<?> getStudentCourse(@RequestParam(defaultValue = "1") Integer pageNum,
                                   @RequestParam(defaultValue = "10") Integer pageSize,
                                   @RequestParam(defaultValue = "") String studentId,
                                   @RequestParam(defaultValue = "") String search) {
        Page<ScVO> page = scMapper.getStudentCourse(new Page<>(pageNum, pageSize), studentId);
        return Result.success(page);
    }

    @GetMapping("/getCourseList")
    public Result<?> getCourseList(@RequestParam(defaultValue = "1") Integer pageNum,
                              @RequestParam(defaultValue = "10") Integer pageSize,
                              @RequestParam(defaultValue = "") String studentId,
                              @RequestParam(defaultValue = "") String search) {
        Page<ScVO> page = scMapper.getCourseList(new Page<>(pageNum, pageSize), studentId);
        return Result.success(page);
    }

    @PostMapping("/insert")
    public Result<?> insertStudent(@RequestBody Student student){
        studentService.save(student);
        return Result.success();
    }

    @PostMapping("/checkin")
    public Result<?> checkinStudent(@RequestBody Student student){
        studentService.save(student);
        return Result.success();
    }


}
