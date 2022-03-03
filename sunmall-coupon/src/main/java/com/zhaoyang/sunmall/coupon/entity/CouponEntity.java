package com.zhaoyang.sunmall.coupon.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sms_coupon", schema = "sunmall-sms", catalog = "")
public class CouponEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "coupon_type")
    private Byte couponType;
    @Basic
    @Column(name = "coupon_img")
    private String couponImg;
    @Basic
    @Column(name = "coupon_name")
    private String couponName;
    @Basic
    @Column(name = "num")
    private Integer num;
    @Basic
    @Column(name = "amount")
    private BigDecimal amount;
    @Basic
    @Column(name = "per_limit")
    private Integer perLimit;
    @Basic
    @Column(name = "min_point")
    private BigDecimal minPoint;
    @Basic
    @Column(name = "start_time")
    private Timestamp startTime;
    @Basic
    @Column(name = "end_time")
    private Timestamp endTime;
    @Basic
    @Column(name = "use_type")
    private Byte useType;
    @Basic
    @Column(name = "note")
    private String note;
    @Basic
    @Column(name = "publish_count")
    private Integer publishCount;
    @Basic
    @Column(name = "use_count")
    private Integer useCount;
    @Basic
    @Column(name = "receive_count")
    private Integer receiveCount;
    @Basic
    @Column(name = "enable_start_time")
    private Timestamp enableStartTime;
    @Basic
    @Column(name = "enable_end_time")
    private Timestamp enableEndTime;
    @Basic
    @Column(name = "code")
    private String code;
    @Basic
    @Column(name = "member_level")
    private Byte memberLevel;
    @Basic
    @Column(name = "publish")
    private Byte publish;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Byte getCouponType() {
        return couponType;
    }

    public void setCouponType(Byte couponType) {
        this.couponType = couponType;
    }

    public String getCouponImg() {
        return couponImg;
    }

    public void setCouponImg(String couponImg) {
        this.couponImg = couponImg;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getPerLimit() {
        return perLimit;
    }

    public void setPerLimit(Integer perLimit) {
        this.perLimit = perLimit;
    }

    public BigDecimal getMinPoint() {
        return minPoint;
    }

    public void setMinPoint(BigDecimal minPoint) {
        this.minPoint = minPoint;
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

    public Byte getUseType() {
        return useType;
    }

    public void setUseType(Byte useType) {
        this.useType = useType;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getPublishCount() {
        return publishCount;
    }

    public void setPublishCount(Integer publishCount) {
        this.publishCount = publishCount;
    }

    public Integer getUseCount() {
        return useCount;
    }

    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
    }

    public Integer getReceiveCount() {
        return receiveCount;
    }

    public void setReceiveCount(Integer receiveCount) {
        this.receiveCount = receiveCount;
    }

    public Timestamp getEnableStartTime() {
        return enableStartTime;
    }

    public void setEnableStartTime(Timestamp enableStartTime) {
        this.enableStartTime = enableStartTime;
    }

    public Timestamp getEnableEndTime() {
        return enableEndTime;
    }

    public void setEnableEndTime(Timestamp enableEndTime) {
        this.enableEndTime = enableEndTime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Byte getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(Byte memberLevel) {
        this.memberLevel = memberLevel;
    }

    public Byte getPublish() {
        return publish;
    }

    public void setPublish(Byte publish) {
        this.publish = publish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CouponEntity that = (CouponEntity) o;
        return id == that.id && Objects.equals(couponType, that.couponType) && Objects.equals(couponImg, that.couponImg) && Objects.equals(couponName, that.couponName) && Objects.equals(num, that.num) && Objects.equals(amount, that.amount) && Objects.equals(perLimit, that.perLimit) && Objects.equals(minPoint, that.minPoint) && Objects.equals(startTime, that.startTime) && Objects.equals(endTime, that.endTime) && Objects.equals(useType, that.useType) && Objects.equals(note, that.note) && Objects.equals(publishCount, that.publishCount) && Objects.equals(useCount, that.useCount) && Objects.equals(receiveCount, that.receiveCount) && Objects.equals(enableStartTime, that.enableStartTime) && Objects.equals(enableEndTime, that.enableEndTime) && Objects.equals(code, that.code) && Objects.equals(memberLevel, that.memberLevel) && Objects.equals(publish, that.publish);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, couponType, couponImg, couponName, num, amount, perLimit, minPoint, startTime, endTime, useType, note, publishCount, useCount, receiveCount, enableStartTime, enableEndTime, code, memberLevel, publish);
    }
}
