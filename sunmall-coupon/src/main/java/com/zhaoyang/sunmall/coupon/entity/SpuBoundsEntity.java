package com.zhaoyang.sunmall.coupon.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Data
@Entity
@Table(name = "sms_spu_bounds", schema = "sunmall-sms", catalog = "")
public class SpuBoundsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "spu_id")
    private Long spuId;
    @Basic
    @Column(name = "grow_bounds")
    private BigDecimal growBounds;
    @Basic
    @Column(name = "buy_bounds")
    private BigDecimal buyBounds;
    @Basic
    @Column(name = "work", columnDefinition = "TINYINT", length = 2)
    private Byte work;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpuBoundsEntity that = (SpuBoundsEntity) o;
        return id == that.id && Objects.equals(spuId, that.spuId) && Objects.equals(growBounds, that.growBounds) && Objects.equals(buyBounds, that.buyBounds) && Objects.equals(work, that.work);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, spuId, growBounds, buyBounds, work);
    }
}
