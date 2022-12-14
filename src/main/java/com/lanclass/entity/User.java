package com.lanclass.entity;

import com.lanclass.util.VeDate;

import java.io.Serializable;

public class User implements Serializable {
    private String usersid = "U" + VeDate.getStringId();// 生成主键编号
    private String username;// 用户名
    private String password;// 密码
    private String realname;// 姓名
    private String sex;// 性别
    private String birthday;// 出生日期
    private String contact;// 联系方式
    private String image;// 头像
    private String status;// 状态
    private String regdate;// 注册日期


    public String getUsersid() {
        return usersid;
    }

    public void setUsersid(String usersid) {
        this.usersid = usersid;
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

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    @Override
    public String toString() {
        return "User{" +
                "usersid='" + usersid + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", realname='" + realname + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", contact='" + contact + '\'' +
                ", image='" + image + '\'' +
                ", status='" + status + '\'' +
                ", regdate='" + regdate + '\'' +
                '}';
    }

    public User(String usersid, String username, String password, String realname, String sex, String birthday, String contact, String image, String status, String regdate) {
        this.usersid = usersid;
        this.username = username;
        this.password = password;
        this.realname = realname;
        this.sex = sex;
        this.birthday = birthday;
        this.contact = contact;
        this.image = image;
        this.status = status;
        this.regdate = regdate;
    }
}
