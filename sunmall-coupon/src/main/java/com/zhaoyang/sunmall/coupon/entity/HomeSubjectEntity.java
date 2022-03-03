package com.zhaoyang.sunmall.coupon.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sms_home_subject", schema = "sunmall-sms", catalog = "")
public class HomeSubjectEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "sub_title")
    private String subTitle;
    @Basic
    @Column(name = "status")
    private Byte status;
    @Basic
    @Column(name = "url")
    private String url;
    @Basic
    @Column(name = "sort")
    private Integer sort;
    @Basic
    @Column(name = "img")
    private String img;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HomeSubjectEntity that = (HomeSubjectEntity) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(title, that.title) && Objects.equals(subTitle, that.subTitle) && Objects.equals(status, that.status) && Objects.equals(url, that.url) && Objects.equals(sort, that.sort) && Objects.equals(img, that.img);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, title, subTitle, status, url, sort, img);
    }
}
