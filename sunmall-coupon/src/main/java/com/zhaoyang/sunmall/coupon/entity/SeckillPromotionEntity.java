package com.zhaoyang.sunmall.coupon.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sms_seckill_promotion", schema = "sunmall-sms", catalog = "")
public class SeckillPromotionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "start_time")
    private Timestamp startTime;
    @Basic
    @Column(name = "end_time")
    private Timestamp endTime;
    @Basic
    @Column(name = "status")
    private Byte status;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "user_id")
    private Long userId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeckillPromotionEntity that = (SeckillPromotionEntity) o;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(startTime, that.startTime) && Objects.equals(endTime, that.endTime) && Objects.equals(status, that.status) && Objects.equals(createTime, that.createTime) && Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, startTime, endTime, status, createTime, userId);
    }
}
