package com.zhaoyang.sunmall.coupon.entity;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Data
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
    @Type(type = "boolean")
    private Boolean getType;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "use_type", columnDefinition = "TINYINT", length = 2)
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
