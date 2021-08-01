package com.sign.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class User implements Serializable {
    @TableId(value = "user_id")
    private String userId;

    private String password;

    private Integer roleId;
}
