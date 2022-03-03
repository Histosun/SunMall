package com.zhaoyang.sunmall.product.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
@Table(name = "pms_spu_images", schema = "sunmall-pms", catalog = "")
public class SpuImagesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "spu_id")
    private Long spuId;
    @Basic
    @Column(name = "img_name")
    private String imgName;
    @Basic
    @Column(name = "img_url")
    private String imgUrl;
    @Basic
    @Column(name = "img_sort")
    private Integer imgSort;
    @Basic
    @Column(name = "default_img")
    private Byte defaultImg;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpuImagesEntity that = (SpuImagesEntity) o;
        return id == that.id && Objects.equals(spuId, that.spuId) && Objects.equals(imgName, that.imgName) && Objects.equals(imgUrl, that.imgUrl) && Objects.equals(imgSort, that.imgSort) && Objects.equals(defaultImg, that.defaultImg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, spuId, imgName, imgUrl, imgSort, defaultImg);
    }
}
