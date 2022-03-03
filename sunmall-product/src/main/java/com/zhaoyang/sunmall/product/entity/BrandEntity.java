package com.zhaoyang.sunmall.product.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
@Table(name = "pms_brand", schema = "sunmall-pms", catalog = "")
public class BrandEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "brand_id")
    private long brandId;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "logo")
    private String logo;
    @Basic
    @Column(name = "descript")
    private String descript;
    @Basic
    @Column(name = "show_status")
    private Byte showStatus;
    @Basic
    @Column(name = "first_letter")
    private String firstLetter;
    @Basic
    @Column(name = "sort")
    private Integer sort;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BrandEntity that = (BrandEntity) o;
        return brandId == that.brandId && Objects.equals(name, that.name) && Objects.equals(logo, that.logo) && Objects.equals(descript, that.descript) && Objects.equals(showStatus, that.showStatus) && Objects.equals(firstLetter, that.firstLetter) && Objects.equals(sort, that.sort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandId, name, logo, descript, showStatus, firstLetter, sort);
    }
}
