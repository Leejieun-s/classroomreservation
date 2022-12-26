package com.lanclass.entity;

import com.lanclass.util.VeDate;

public class Rooms {
    private String roomsid = "R" + VeDate.getStringId();// 生成主键编号
    private String roomsname;// 教室名称
    private String image;// 图片
    private String cateid;// 教室类型
    private String manager;// 教室负责人
    private String address;// 教室地址
    private String contact;// 联系方式
    private String dept;// 所属学院
    private String addtime;// 创建日期
    private String contents;// 教室介绍
    private String catename;// 映射数据

    public String getRoomsid() {
        return roomsid;
    }

    public void setRoomsid(String roomsid) {
        this.roomsid = roomsid;
    }

    public String getRoomsname() {
        return this.roomsname;
    }

    public void setRoomsname(String roomsname) {
        this.roomsname = roomsname;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCateid() {
        return this.cateid;
    }

    public void setCateid(String cateid) {
        this.cateid = cateid;
    }

    public String getManager() {
        return this.manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return this.contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDept() {
        return this.dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getAddtime() {
        return this.addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public String getContents() {
        return this.contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getCatename() {
        return this.catename;
    }

    public void setCatename(String catename) {
        this.catename = catename;
    }

    // 重载方法 生成JSON类型字符串
    @Override
    public String toString() {
        return "Rooms [roomsid=" + this.roomsid + ", roomsname=" + this.roomsname + ", image=" + this.image + ", cateid=" + this.cateid
                + ", manager=" + this.manager + ", address=" + this.address + ", contact=" + this.contact + ", dept=" + this.dept + ", addtime="
                + this.addtime + ", contents=" + this.contents + ", catename=" + this.catename + "]";
    }

}
