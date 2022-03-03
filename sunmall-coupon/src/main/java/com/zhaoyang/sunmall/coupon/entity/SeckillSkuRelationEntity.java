package com.zhaoyang.sunmall.coupon.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Data
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
    private BigDecimal seckillPrice;
    @Basic
    @Column(name = "seckill_count")
    private BigDecimal seckillCount;
    @Basic
    @Column(name = "seckill_limit")
    private BigDecimal seckillLimit;
    @Basic
    @Column(name = "seckill_sort")
    private Integer seckillSort;

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
