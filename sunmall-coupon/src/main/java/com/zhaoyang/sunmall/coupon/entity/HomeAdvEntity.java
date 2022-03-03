package com.zhaoyang.sunmall.coupon.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Data
@Entity
@Table(name = "sms_home_adv", schema = "sunmall-sms", catalog = "")
public class HomeAdvEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "pic")
    private String pic;
    @Basic
    @Column(name = "start_time")
    private Timestamp startTime;
    @Basic
    @Column(name = "end_time")
    private Timestamp endTime;
    @Basic
    @Column(name = "status", columnDefinition = "TINYINT", length = 2)
    private Byte status;
    @Basic
    @Column(name = "click_count")
    private Integer clickCount;
    @Basic
    @Column(name = "url")
    private String url;
    @Basic
    @Column(name = "note")
    private String note;
    @Basic
    @Column(name = "sort")
    private Integer sort;
    @Basic
    @Column(name = "publisher_id")
    private Long publisherId;
    @Basic
    @Column(name = "auth_id")
    private Long authId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HomeAdvEntity that = (HomeAdvEntity) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(pic, that.pic) && Objects.equals(startTime, that.startTime) && Objects.equals(endTime, that.endTime) && Objects.equals(status, that.status) && Objects.equals(clickCount, that.clickCount) && Objects.equals(url, that.url) && Objects.equals(note, that.note) && Objects.equals(sort, that.sort) && Objects.equals(publisherId, that.publisherId) && Objects.equals(authId, that.authId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, pic, startTime, endTime, status, clickCount, url, note, sort, publisherId, authId);
    }
}
