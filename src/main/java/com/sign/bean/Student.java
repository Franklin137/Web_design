package com.sign.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

import java.awt.*;
import java.io.Serializable;

@Data
@ToString
@TableName("student")
public class Student implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String studentId;
    private String name;
    private String sex;
    private String className;
    private Image image;
    private String email;
}
