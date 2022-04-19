package com.wyz.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private long id;
    private String name;
    private String password;
    private double score;
    private Date birthday;
}
