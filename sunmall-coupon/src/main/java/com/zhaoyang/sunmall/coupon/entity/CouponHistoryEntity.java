package com.zhaoyang.sunmall.coupon.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sms_coupon_history", schema = "sunmall-sms", catalog = "")
public class CouponHistoryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "coupon_id")
    private Long couponId;
    @Basic
    @Column(name = "member_id")
    private Long memberId;
    @Basic
    @Column(name = "member_nick_name")
    private String memberNickName;
    @Basic
    @Column(name = "get_type")
    private Byte getType;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "use_type")
    private Byte useType;
    @Basic
    @Column(name = "use_time")
    private Timestamp useTime;
    @Basic
    @Column(name = "order_id")
    private Long orderId;
    @Basic
    @Column(name = "order_sn")
    private Long orderSn;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getMemberNickName() {
        return memberNickName;
    }

    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName;
    }

    public Byte getGetType() {
        return getType;
    }

    public void setGetType(Byte getType) {
        this.getType = getType;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Byte getUseType() {
        return useType;
    }

    public void setUseType(Byte useType) {
        this.useType = useType;
    }

    public Timestamp getUseTime() {
        return useTime;
    }

    public void setUseTime(Timestamp useTime) {
        this.useTime = useTime;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(Long orderSn) {
        this.orderSn = orderSn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CouponHistoryEntity that = (CouponHistoryEntity) o;
        return id == that.id && Objects.equals(couponId, that.couponId) && Objects.equals(memberId, that.memberId) && Objects.equals(memberNickName, that.memberNickName) && Objects.equals(getType, that.getType) && Objects.equals(createTime, that.createTime) && Objects.equals(useType, that.useType) && Objects.equals(useTime, that.useTime) && Objects.equals(orderId, that.orderId) && Objects.equals(orderSn, that.orderSn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, couponId, memberId, memberNickName, getType, createTime, useType, useTime, orderId, orderSn);
    }
}
