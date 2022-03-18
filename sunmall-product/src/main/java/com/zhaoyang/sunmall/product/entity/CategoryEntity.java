package com.zhaoyang.sunmall.product.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Data
@Entity
@DynamicUpdate
@Where(clause = "show_status = 1")
@Table(name = "pms_category", schema = "sunmall-pms", catalog = "")
public class CategoryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "cat_id")
    private long catId;
    @Basic
    @Column(name = "name", columnDefinition = "char", length = 50)
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
    @Type(type = "char")
    private String icon;
    @Basic
    @Column(name = "product_unit")
    @Type(type = "char")
    private String productUnit;
    @Basic
    @Column(name = "product_count")
    private Integer productCount;

    @Transient
    private List<CategoryEntity> subCategory;

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
