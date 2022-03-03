package com.zhaoyang.sunmall.coupon.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sms_coupon_spu_category_relation", schema = "sunmall-sms", catalog = "")
public class CouponSpuCategoryRelationEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "coupon_id")
    private Long couponId;
    @Basic
    @Column(name = "category_id")
    private Long categoryId;
    @Basic
    @Column(name = "category_name")
    private String categoryName;

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

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CouponSpuCategoryRelationEntity that = (CouponSpuCategoryRelationEntity) o;
        return id == that.id && Objects.equals(couponId, that.couponId) && Objects.equals(categoryId, that.categoryId) && Objects.equals(categoryName, that.categoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, couponId, categoryId, categoryName);
    }
}
