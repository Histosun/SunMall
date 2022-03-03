package com.zhaoyang.sunmall.order.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Data
@Entity
@Table(name = "pms_sku_info", schema = "sunmall-oms", catalog = "")
public class PmsSkuInfoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "sku_id")
    private long skuId;
    @Basic
    @Column(name = "spu_id")
    private Long spuId;
    @Basic
    @Column(name = "sku_name")
    private String skuName;
    @Basic
    @Column(name = "sku_desc")
    private String skuDesc;
    @Basic
    @Column(name = "catalog_id")
    private Long catalogId;
    @Basic
    @Column(name = "brand_id")
    private Long brandId;
    @Basic
    @Column(name = "sku_default_img")
    private String skuDefaultImg;
    @Basic
    @Column(name = "sku_title")
    private String skuTitle;
    @Basic
    @Column(name = "sku_subtitle")
    private String skuSubtitle;
    @Basic
    @Column(name = "price")
    private BigDecimal price;
    @Basic
    @Column(name = "sale_count")
    private Long saleCount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsSkuInfoEntity that = (PmsSkuInfoEntity) o;
        return skuId == that.skuId && Objects.equals(spuId, that.spuId) && Objects.equals(skuName, that.skuName) && Objects.equals(skuDesc, that.skuDesc) && Objects.equals(catalogId, that.catalogId) && Objects.equals(brandId, that.brandId) && Objects.equals(skuDefaultImg, that.skuDefaultImg) && Objects.equals(skuTitle, that.skuTitle) && Objects.equals(skuSubtitle, that.skuSubtitle) && Objects.equals(price, that.price) && Objects.equals(saleCount, that.saleCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skuId, spuId, skuName, skuDesc, catalogId, brandId, skuDefaultImg, skuTitle, skuSubtitle, price, saleCount);
    }
}
