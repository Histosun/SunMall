package com.zhaoyang.sunmall.coupon.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sms_seckill_sku_relation", schema = "sunmall-sms", catalog = "")
public class SeckillSkuRelationEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "promotion_id")
    private Long promotionId;
    @Basic
    @Column(name = "promotion_session_id")
    private Long promotionSessionId;
    @Basic
    @Column(name = "sku_id")
    private Long skuId;
    @Basic
    @Column(name = "seckill_price")
    private Integer seckillPrice;
    @Basic
    @Column(name = "seckill_count")
    private Integer seckillCount;
    @Basic
    @Column(name = "seckill_limit")
    private Integer seckillLimit;
    @Basic
    @Column(name = "seckill_sort")
    private Integer seckillSort;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Long promotionId) {
        this.promotionId = promotionId;
    }

    public Long getPromotionSessionId() {
        return promotionSessionId;
    }

    public void setPromotionSessionId(Long promotionSessionId) {
        this.promotionSessionId = promotionSessionId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Integer getSeckillPrice() {
        return seckillPrice;
    }

    public void setSeckillPrice(Integer seckillPrice) {
        this.seckillPrice = seckillPrice;
    }

    public Integer getSeckillCount() {
        return seckillCount;
    }

    public void setSeckillCount(Integer seckillCount) {
        this.seckillCount = seckillCount;
    }

    public Integer getSeckillLimit() {
        return seckillLimit;
    }

    public void setSeckillLimit(Integer seckillLimit) {
        this.seckillLimit = seckillLimit;
    }

    public Integer getSeckillSort() {
        return seckillSort;
    }

    public void setSeckillSort(Integer seckillSort) {
        this.seckillSort = seckillSort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeckillSkuRelationEntity that = (SeckillSkuRelationEntity) o;
        return id == that.id && Objects.equals(promotionId, that.promotionId) && Objects.equals(promotionSessionId, that.promotionSessionId) && Objects.equals(skuId, that.skuId) && Objects.equals(seckillPrice, that.seckillPrice) && Objects.equals(seckillCount, that.seckillCount) && Objects.equals(seckillLimit, that.seckillLimit) && Objects.equals(seckillSort, that.seckillSort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, promotionId, promotionSessionId, skuId, seckillPrice, seckillCount, seckillLimit, seckillSort);
    }
}
