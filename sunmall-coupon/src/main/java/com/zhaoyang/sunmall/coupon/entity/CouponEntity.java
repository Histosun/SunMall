package com.zhaoyang.sunmall.coupon.entity;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Data
@Entity
@Table(name = "sms_coupon", schema = "sunmall-sms", catalog = "")
public class CouponEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "coupon_type", columnDefinition = "TINYINT", length = 2)
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
    @Column(name = "use_type", columnDefinition = "TINYINT", length = 2)
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
    @Column(name = "member_level", columnDefinition = "TINYINT", length = 2)
    private Byte memberLevel;
    @Basic
    @Column(name = "publish")
    private Boolean publish;

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
