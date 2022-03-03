package com.zhaoyang.sunmall.product.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
@Table(name = "pms_sku_sale_attr_value", schema = "sunmall-pms", catalog = "")
public class SkuSaleAttrValueEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "sku_id")
    private Long skuId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SkuSaleAttrValueEntity that = (SkuSaleAttrValueEntity) o;
        return id == that.id && Objects.equals(skuId, that.skuId) && Objects.equals(attrId, that.attrId) && Objects.equals(attrName, that.attrName) && Objects.equals(attrValue, that.attrValue) && Objects.equals(attrSort, that.attrSort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, skuId, attrId, attrName, attrValue, attrSort);
    }
}
