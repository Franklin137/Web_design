package com.sign.sevices.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sign.bean.Course;
import com.sign.mapper.CourseMapper;
import com.sign.sevices.CourseService;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements CourseService {
}
