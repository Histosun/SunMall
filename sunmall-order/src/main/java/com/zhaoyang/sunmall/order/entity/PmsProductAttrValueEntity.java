package com.zhaoyang.sunmall.order.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
@Table(name = "pms_product_attr_value", schema = "sunmall-oms", catalog = "")
public class PmsProductAttrValueEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "spu_id")
    private Long spuId;
    @Basic
    @Column(name = "attr_id")
    private Long attrId;
    @Basic
    @Column(name = "attr_name")
    private String attrName;
    @Basic
    @Column(name = "attr_value")
    private String attrValue;
    @Basic
    @Column(name = "attr_sort")
    private Integer attrSort;
    @Basic
    @Column(name = "quick_show")
    private Byte quickShow;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsProductAttrValueEntity that = (PmsProductAttrValueEntity) o;
        return id == that.id && Objects.equals(spuId, that.spuId) && Objects.equals(attrId, that.attrId) && Objects.equals(attrName, that.attrName) && Objects.equals(attrValue, that.attrValue) && Objects.equals(attrSort, that.attrSort) && Objects.equals(quickShow, that.quickShow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, spuId, attrId, attrName, attrValue, attrSort, quickShow);
    }
}
