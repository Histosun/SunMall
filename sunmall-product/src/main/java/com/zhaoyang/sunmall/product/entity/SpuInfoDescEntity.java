package com.zhaoyang.sunmall.product.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
@Table(name = "pms_spu_info_desc", schema = "sunmall-pms", catalog = "")
public class SpuInfoDescEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "spu_id")
    private long spuId;
    @Basic
    @Column(name = "descript", columnDefinition = "LONGTEXT")
    private String descript;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpuInfoDescEntity that = (SpuInfoDescEntity) o;
        return spuId == that.spuId && Objects.equals(descript, that.descript);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spuId, descript);
    }
}
