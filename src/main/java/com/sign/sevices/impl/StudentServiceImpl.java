package com.sign.sevices.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sign.bean.Student;
import com.sign.mapper.StudentMapper;
import com.sign.sevices.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
