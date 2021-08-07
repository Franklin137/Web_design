package com.sign.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@TableName("teacher")
public class Teacher implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private String sex;
    private String work_id;
}
