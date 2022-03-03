package com.zhaoyang.sunmall.product.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Data
@Entity
@Table(name = "pms_spu_info", schema = "sunmall-pms", catalog = "")
public class SpuInfoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "spu_name")
    private String spuName;
    @Basic
    @Column(name = "spu_description")
    private String spuDescription;
    @Basic
    @Column(name = "catalog_id")
    private Long catalogId;
    @Basic
    @Column(name = "brand_id")
    private Long brandId;
    @Basic
    @Column(name = "weight")
    private BigDecimal weight;
    @Basic
    @Column(name = "publish_status")
    private Byte publishStatus;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "update_time")
    private Timestamp updateTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpuInfoEntity that = (SpuInfoEntity) o;
        return id == that.id && Objects.equals(spuName, that.spuName) && Objects.equals(spuDescription, that.spuDescription) && Objects.equals(catalogId, that.catalogId) && Objects.equals(brandId, that.brandId) && Objects.equals(weight, that.weight) && Objects.equals(publishStatus, that.publishStatus) && Objects.equals(createTime, that.createTime) && Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, spuName, spuDescription, catalogId, brandId, weight, publishStatus, createTime, updateTime);
    }
}
