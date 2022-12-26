package com.lanclass.entity;

import com.lanclass.util.VeDate;

public class Orders {
    private String ordersid = "O" + VeDate.getStringId();// 生成主键编号
    private String ordercode;// 预约单号
    private String usersid;// 教师
    private String roomsid;// 教室
    private String clazzid;// 上课班级
    private String orderdate;// 日期
    private String ctimeid;// 课时
    private String reason;// 原因
    private String addtime;// 生成日期
    private String status;// 状态
    private String memo;// 备注
    private String realname;// 映射数据
    private String roomsname;// 映射数据
    private String clazzname;// 映射数据
    private String ctimename;// 映射数据

    public String getOrdersid() {
        return ordersid;
    }

    public void setOrdersid(String ordersid) {
        this.ordersid = ordersid;
    }

    public String getOrdercode() {
        return this.ordercode;
    }

    public void setOrdercode(String ordercode) {
        this.ordercode = ordercode;
    }

    public String getUsersid() {
        return this.usersid;
    }

    public void setUsersid(String usersid) {
        this.usersid = usersid;
    }

    public String getRoomsid() {
        return this.roomsid;
    }

    public void setRoomsid(String roomsid) {
        this.roomsid = roomsid;
    }

    public String getClazzid() {
        return this.clazzid;
    }

    public void setClazzid(String clazzid) {
        this.clazzid = clazzid;
    }

    public String getOrderdate() {
        return this.orderdate;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    public String getCtimeid() {
        return this.ctimeid;
    }

    public void setCtimeid(String ctimeid) {
        this.ctimeid = ctimeid;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getAddtime() {
        return this.addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getRoomsname() {
        return this.roomsname;
    }

    public void setRoomsname(String roomsname) {
        this.roomsname = roomsname;
    }

    public String getClazzname() {
        return this.clazzname;
    }

    public void setClazzname(String clazzname) {
        this.clazzname = clazzname;
    }

    public String getCtimename() {
        return this.ctimename;
    }

    public void setCtimename(String ctimename) {
        this.ctimename = ctimename;
    }

    // 重载方法 生成JSON类型字符串
    @Override
    public String toString() {
        return "Orders [ordersid=" + this.ordersid + ", ordercode=" + this.ordercode + ", usersid=" + this.usersid + ", roomsid=" + this.roomsid
                + ", clazzid=" + this.clazzid + ", orderdate=" + this.orderdate + ", ctimeid=" + this.ctimeid + ", reason=" + this.reason
                + ", addtime=" + this.addtime + ", status=" + this.status + ", memo=" + this.memo + ", realname=" + this.realname
                + ", roomsname=" + this.roomsname + ", clazzname=" + this.clazzname + ", ctimename=" + this.ctimename + "]";
    }

}
