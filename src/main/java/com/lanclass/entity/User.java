package com.lanclass.entity;

import com.lanclass.util.VeDate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel("用户信息实体")
public class User implements Serializable {

    @ApiModelProperty("用户id")
    private String usersid = "U" + VeDate.getStringId();// 生成主键编号

    @ApiModelProperty("用户名")
    private String username;// 用户名

    @ApiModelProperty("用户密码")
    private String password;// 密码

    @ApiModelProperty("用户姓名")
    private String realname;// 姓名

    @ApiModelProperty("用户性别")
    private String sex;// 性别

    @ApiModelProperty("出生年龄")
    private String birthday;// 出生日期

    @ApiModelProperty("用户邮箱")
    private String contact;// 联系方式

    @ApiModelProperty("用户头像")
    private String image;// 头像

    @ApiModelProperty("用户状态")
    private String status;// 状态

    @ApiModelProperty("用户注册时间")
    private String regdate;// 注册日期

    public User() {
        super();
    }


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
