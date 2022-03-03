package com.zhaoyang.sunmall.coupon.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "sms_sku_ladder", schema = "sunmall-sms", catalog = "")
public class SkuLadderEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "sku_id")
    private Long skuId;
    @Basic
    @Column(name = "full_count")
    private Integer fullCount;
    @Basic
    @Column(name = "discount")
    private BigDecimal discount;
    @Basic
    @Column(name = "price")
    private BigDecimal price;
    @Basic
    @Column(name = "add_other")
    private Byte addOther;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Integer getFullCount() {
        return fullCount;
    }

    public void setFullCount(Integer fullCount) {
        this.fullCount = fullCount;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Byte getAddOther() {
        return addOther;
    }

    public void setAddOther(Byte addOther) {
        this.addOther = addOther;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SkuLadderEntity that = (SkuLadderEntity) o;
        return id == that.id && Objects.equals(skuId, that.skuId) && Objects.equals(fullCount, that.fullCount) && Objects.equals(discount, that.discount) && Objects.equals(price, that.price) && Objects.equals(addOther, that.addOther);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, skuId, fullCount, discount, price, addOther);
    }
}
