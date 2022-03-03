package com.zhaoyang.sunmall.coupon.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "sms_sku_full_reduction", schema = "sunmall-sms", catalog = "")
public class SkuFullReductionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "sku_id")
    private Long skuId;
    @Basic
    @Column(name = "full_price")
    private BigDecimal fullPrice;
    @Basic
    @Column(name = "reduce_price")
    private BigDecimal reducePrice;
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

    public BigDecimal getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(BigDecimal fullPrice) {
        this.fullPrice = fullPrice;
    }

    public BigDecimal getReducePrice() {
        return reducePrice;
    }

    public void setReducePrice(BigDecimal reducePrice) {
        this.reducePrice = reducePrice;
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
        SkuFullReductionEntity that = (SkuFullReductionEntity) o;
        return id == that.id && Objects.equals(skuId, that.skuId) && Objects.equals(fullPrice, that.fullPrice) && Objects.equals(reducePrice, that.reducePrice) && Objects.equals(addOther, that.addOther);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, skuId, fullPrice, reducePrice, addOther);
    }
}
