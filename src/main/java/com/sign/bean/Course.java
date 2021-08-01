package com.sign.bean;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class Course implements Serializable {
    private Integer courseId;
    private String cname;
    private String term;
    private String address;
}
