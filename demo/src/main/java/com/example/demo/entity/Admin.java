package com.example.demo.entity;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class Admin implements Serializable {
    private String adminId;
    private String username;
    private String password;
    private Date loginTime;



}
