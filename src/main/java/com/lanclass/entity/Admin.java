package com.lanclass.entity;

import com.lanclass.util.VeDate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("管理员信息实体")
public class Admin {
    @ApiModelProperty("管理员主键编号")
    private String adminid = "A" + VeDate.getStringId();// 生成主键编号
    @ApiModelProperty("管理员用户名")
    private String username;// 用户名
    @ApiModelProperty("管理员密码")
    private String password;// 密码
    @ApiModelProperty("管理员姓名")
    private String realname;// 姓名
    @ApiModelProperty("管理员联系方式")
    private String contact;// 联系方式
    @ApiModelProperty("管理员创建日期")
    private String addtime;// 创建日期

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return this.realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getContact() {
        return this.contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddtime() {
        return this.addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public Admin(String adminid, String username, String password, String realname, String contact, String addtime) {
        this.adminid = adminid;
        this.username = username;
        this.password = password;
        this.realname = realname;
        this.contact = contact;
        this.addtime = addtime;
    }

    // 重载方法 生成JSON类型字符串
    @Override
    public String toString() {
        return "Admin [adminid=" + this.adminid + ", username=" + this.username + ", password=" + this.password + ", realname=" + this.realname
                + ", contact=" + this.contact + ", addtime=" + this.addtime + "]";
    }
}
