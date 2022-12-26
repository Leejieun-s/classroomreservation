package com.lanclass.entity;

import com.lanclass.util.VeDate;

public class Clazz {
    private String clazzid = "C" + VeDate.getStringId();// 生成主键编号
    private String clazzname;// 班级名称
    private String usersid;// 教师
    private String manager;// 班长
    private String dept;// 所属学院
    private String memo;// 备注
    private String realname;// 映射数据

    public String getClazzid() {
        return clazzid;
    }

    public void setClazzid(String clazzid) {
        this.clazzid = clazzid;
    }

    public String getClazzname() {
        return this.clazzname;
    }

    public void setClazzname(String clazzname) {
        this.clazzname = clazzname;
    }

    public String getUsersid() {
        return this.usersid;
    }

    public void setUsersid(String usersid) {
        this.usersid = usersid;
    }

    public String getManager() {
        return this.manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getDept() {
        return this.dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getRealname() {
        return this.realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    // 重载方法 生成JSON类型字符串
    @Override
    public String toString() {
        return "Clazz [clazzid=" + this.clazzid + ", clazzname=" + this.clazzname + ", usersid=" + this.usersid + ", manager=" + this.manager
                + ", dept=" + this.dept + ", memo=" + this.memo + ", realname=" + this.realname + "]";
    }
}
