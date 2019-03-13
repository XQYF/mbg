package com.baizhi.entity;


import java.io.Serializable;
import java.util.Date;

public class Admin implements Serializable {
    private String adminId;
    private String username;
    private String password;
    private Date loginTime;

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Admin(String adminId, String username, String password, Date loginTime) {
        this.adminId = adminId;
        this.username = username;
        this.password = password;
        this.loginTime = loginTime;
    }

    public Admin() {
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId='" + adminId + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", loginTime=" + loginTime +
                '}';
    }
}
