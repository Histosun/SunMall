package com.zhaoyang.sunmall.coupon.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sms_coupon_spu_relation", schema = "sunmall-sms", catalog = "")
public class CouponSpuRelationEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "coupon_id")
    private Long couponId;
    @Basic
    @Column(name = "spu_id")
    private Long spuId;
    @Basic
    @Column(name = "spu_name")
    private String spuName;

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

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public String getSpuName() {
        return spuName;
    }

    public void setSpuName(String spuName) {
        this.spuName = spuName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CouponSpuRelationEntity that = (CouponSpuRelationEntity) o;
        return id == that.id && Objects.equals(couponId, that.couponId) && Objects.equals(spuId, that.spuId) && Objects.equals(spuName, that.spuName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, couponId, spuId, spuName);
    }
}
