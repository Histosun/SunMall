package com.zhaoyang.sunmall.product.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
@Table(name = "pms_category", schema = "sunmall-pms", catalog = "")
public class CategoryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "cat_id")
    private long catId;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "parent_cid")
    private Long parentCid;
    @Basic
    @Column(name = "cat_level")
    private Integer catLevel;
    @Basic
    @Column(name = "show_status")
    private Byte showStatus;
    @Basic
    @Column(name = "sort")
    private Integer sort;
    @Basic
    @Column(name = "icon")
    private String icon;
    @Basic
    @Column(name = "product_unit")
    private String productUnit;
    @Basic
    @Column(name = "product_count")
    private Integer productCount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryEntity that = (CategoryEntity) o;
        return catId == that.catId && Objects.equals(name, that.name) && Objects.equals(parentCid, that.parentCid) && Objects.equals(catLevel, that.catLevel) && Objects.equals(showStatus, that.showStatus) && Objects.equals(sort, that.sort) && Objects.equals(icon, that.icon) && Objects.equals(productUnit, that.productUnit) && Objects.equals(productCount, that.productCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catId, name, parentCid, catLevel, showStatus, sort, icon, productUnit, productCount);
    }
}
