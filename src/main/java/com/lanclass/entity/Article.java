package com.lanclass.entity;

import com.lanclass.util.VeDate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("文章信息实体")
public class Article {
    @ApiModelProperty("主键编号")
    private String articleid = "A" + VeDate.getStringId();// 生成主键编号
    @ApiModelProperty("文章标题")
    private String title;// 标题
    @ApiModelProperty("文章栏目")
    private String bannerid;// 栏目
    @ApiModelProperty("文章图片")
    private String image;// 图片
    @ApiModelProperty("文章内容")
    private String contents;// 内容
    @ApiModelProperty("文章发布日期")
    private String addtime;// 发布日期
    @ApiModelProperty("文章点击数")
    private String hits;// 点击数
    @ApiModelProperty("文章映射数据")
    private String bannername;// 映射数据

    public String getArticleid() {
        return articleid;
    }

    public void setArticleid(String articleid) {
        this.articleid = articleid;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBannerid() {
        return this.bannerid;
    }

    public void setBannerid(String bannerid) {
        this.bannerid = bannerid;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getContents() {
        return this.contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getAddtime() {
        return this.addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public String getHits() {
        return this.hits;
    }

    public void setHits(String hits) {
        this.hits = hits;
    }

    public String getBannername() {
        return this.bannername;
    }

    public void setBannername(String bannername) {
        this.bannername = bannername;
    }

    public Article(String articleid, String title, String bannerid, String image, String contents, String addtime, String hits, String bannername) {
        this.articleid = articleid;
        this.title = title;
        this.bannerid = bannerid;
        this.image = image;
        this.contents = contents;
        this.addtime = addtime;
        this.hits = hits;
        this.bannername = bannername;
    }

    // 重载方法 生成JSON类型字符串
    @Override
    public String toString() {
        return "Article [articleid=" + this.articleid + ", title=" + this.title + ", bannerid=" + this.bannerid + ", image=" + this.image
                + ", contents=" + this.contents + ", addtime=" + this.addtime + ", hits=" + this.hits + ", bannername=" + this.bannername + "]";
    }
}
