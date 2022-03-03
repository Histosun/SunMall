package com.zhaoyang.sunmall.product.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
@Table(name = "pms_category_brand_relation", schema = "sunmall-pms", catalog = "")
public class CategoryBrandRelationEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "brand_id")
    private Long brandId;
    @Basic
    @Column(name = "catelog_id")
    private Long catelogId;
    @Basic
    @Column(name = "brand_name")
    private String brandName;
    @Basic
    @Column(name = "catelog_name")
    private String catelogName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryBrandRelationEntity that = (CategoryBrandRelationEntity) o;
        return id == that.id && Objects.equals(brandId, that.brandId) && Objects.equals(catelogId, that.catelogId) && Objects.equals(brandName, that.brandName) && Objects.equals(catelogName, that.catelogName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brandId, catelogId, brandName, catelogName);
    }
}
