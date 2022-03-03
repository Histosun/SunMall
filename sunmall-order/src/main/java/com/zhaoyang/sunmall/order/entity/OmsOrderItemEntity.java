package com.zhaoyang.sunmall.order.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Data
@Entity
@Table(name = "oms_order_item", schema = "sunmall-oms", catalog = "")
public class OmsOrderItemEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "order_id")
    private Long orderId;
    @Basic
    @Column(name = "order_sn")
    private String orderSn;
    @Basic
    @Column(name = "spu_id")
    private Long spuId;
    @Basic
    @Column(name = "spu_name")
    private String spuName;
    @Basic
    @Column(name = "spu_pic")
    private String spuPic;
    @Basic
    @Column(name = "spu_brand")
    private String spuBrand;
    @Basic
    @Column(name = "category_id")
    private Long categoryId;
    @Basic
    @Column(name = "sku_id")
    private Long skuId;
    @Basic
    @Column(name = "sku_name")
    private String skuName;
    @Basic
    @Column(name = "sku_pic")
    private String skuPic;
    @Basic
    @Column(name = "sku_price")
    private BigDecimal skuPrice;
    @Basic
    @Column(name = "sku_quantity")
    private Integer skuQuantity;
    @Basic
    @Column(name = "sku_attrs_vals")
    private String skuAttrsVals;
    @Basic
    @Column(name = "promotion_amount")
    private BigDecimal promotionAmount;
    @Basic
    @Column(name = "coupon_amount")
    private BigDecimal couponAmount;
    @Basic
    @Column(name = "integration_amount")
    private BigDecimal integrationAmount;
    @Basic
    @Column(name = "real_amount")
    private BigDecimal realAmount;
    @Basic
    @Column(name = "gift_integration")
    private Integer giftIntegration;
    @Basic
    @Column(name = "gift_growth")
    private Integer giftGrowth;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OmsOrderItemEntity that = (OmsOrderItemEntity) o;
        return id == that.id && Objects.equals(orderId, that.orderId) && Objects.equals(orderSn, that.orderSn) && Objects.equals(spuId, that.spuId) && Objects.equals(spuName, that.spuName) && Objects.equals(spuPic, that.spuPic) && Objects.equals(spuBrand, that.spuBrand) && Objects.equals(categoryId, that.categoryId) && Objects.equals(skuId, that.skuId) && Objects.equals(skuName, that.skuName) && Objects.equals(skuPic, that.skuPic) && Objects.equals(skuPrice, that.skuPrice) && Objects.equals(skuQuantity, that.skuQuantity) && Objects.equals(skuAttrsVals, that.skuAttrsVals) && Objects.equals(promotionAmount, that.promotionAmount) && Objects.equals(couponAmount, that.couponAmount) && Objects.equals(integrationAmount, that.integrationAmount) && Objects.equals(realAmount, that.realAmount) && Objects.equals(giftIntegration, that.giftIntegration) && Objects.equals(giftGrowth, that.giftGrowth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderId, orderSn, spuId, spuName, spuPic, spuBrand, categoryId, skuId, skuName, skuPic, skuPrice, skuQuantity, skuAttrsVals, promotionAmount, couponAmount, integrationAmount, realAmount, giftIntegration, giftGrowth);
    }
}
