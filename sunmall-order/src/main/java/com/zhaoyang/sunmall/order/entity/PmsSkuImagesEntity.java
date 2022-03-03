package com.zhaoyang.sunmall.order.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
@Table(name = "pms_sku_images", schema = "sunmall-oms", catalog = "")
public class PmsSkuImagesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "sku_id")
    private Long skuId;
    @Basic
    @Column(name = "img_url")
    private String imgUrl;
    @Basic
    @Column(name = "img_sort")
    private Integer imgSort;
    @Basic
    @Column(name = "default_img")
    private Integer defaultImg;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsSkuImagesEntity that = (PmsSkuImagesEntity) o;
        return id == that.id && Objects.equals(skuId, that.skuId) && Objects.equals(imgUrl, that.imgUrl) && Objects.equals(imgSort, that.imgSort) && Objects.equals(defaultImg, that.defaultImg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, skuId, imgUrl, imgSort, defaultImg);
    }
}
