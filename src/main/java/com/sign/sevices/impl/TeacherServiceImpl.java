package com.sign.sevices.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sign.bean.Teacher;
import com.sign.mapper.TeacherMapper;
import com.sign.sevices.TeacherService;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {

}
