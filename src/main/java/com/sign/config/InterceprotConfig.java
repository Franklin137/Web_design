package com.sign.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceprotConfig implements WebMvcConfigurer {
//
//    @Autowired
//    LoginInterceptor loginInterceptor;
//
//    @Autowired
//    TeacherInterceptor teacherInterceptor;
//
//    @Autowired
//    TeacherEditInterceptor teacherEditInterceptor;
//
//    @Autowired
//    StudentInterceptor studentInterceptor;
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(loginInterceptor)
//                .addPathPatterns("/**")
//                .excludePathPatterns("/","/login","/css/**","/fonts/**","/images/**");
//        registry.addInterceptor(teacherInterceptor)
//                .addPathPatterns("/teacher/**");
//        registry.addInterceptor(teacherEditInterceptor)
//                .addPathPatterns("/teacher/edit/**");
//        registry.addInterceptor(studentInterceptor)
//                .addPathPatterns("/student/**");
//    }
}
