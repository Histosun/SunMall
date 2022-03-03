package com.zhaoyang.sunmall.coupon.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "sms_spu_bounds", schema = "sunmall-sms", catalog = "")
public class SmsSpuBoundsEntity {
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
    @Column(name = "work")
    private Byte work;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public BigDecimal getGrowBounds() {
        return growBounds;
    }

    public void setGrowBounds(BigDecimal growBounds) {
        this.growBounds = growBounds;
    }

    public BigDecimal getBuyBounds() {
        return buyBounds;
    }

    public void setBuyBounds(BigDecimal buyBounds) {
        this.buyBounds = buyBounds;
    }

    public Byte getWork() {
        return work;
    }

    public void setWork(Byte work) {
        this.work = work;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmsSpuBoundsEntity that = (SmsSpuBoundsEntity) o;
        return id == that.id && Objects.equals(spuId, that.spuId) && Objects.equals(growBounds, that.growBounds) && Objects.equals(buyBounds, that.buyBounds) && Objects.equals(work, that.work);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, spuId, growBounds, buyBounds, work);
    }
}
