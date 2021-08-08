package com.sign.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@TableName("user")
public class User implements Serializable {
    @TableId(type = IdType.AUTO)
    private String id;
    private String username;
    private String password;
    private Integer usertype;
}
