package com.lanclass.entity;

import com.lanclass.util.VeDate;

public class Ctime {
    private String ctimeid = "C" + VeDate.getStringId();// 生成主键编号
    private String ctimename;// 课时名称
    private String sectionx;// 时间段
    private String memo;// 备注

    public String getCtimeid() {
        return ctimeid;
    }

    public void setCtimeid(String ctimeid) {
        this.ctimeid = ctimeid;
    }

    public String getCtimename() {
        return this.ctimename;
    }

    public void setCtimename(String ctimename) {
        this.ctimename = ctimename;
    }

    public String getSectionx() {
        return this.sectionx;
    }

    public void setSectionx(String sectionx) {
        this.sectionx = sectionx;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    // 重载方法 生成JSON类型字符串
    @Override
    public String toString() {
        return "Ctime [ctimeid=" + this.ctimeid + ", ctimename=" + this.ctimename + ", sectionx=" + this.sectionx + ", memo=" + this.memo + "]";
    }

}
