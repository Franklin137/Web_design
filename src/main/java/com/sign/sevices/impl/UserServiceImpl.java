package com.sign.sevices.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sign.bean.User;
import com.sign.mapper.UserMapper;
import com.sign.sevices.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
