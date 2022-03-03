package com.zhaoyang.sunmall.product.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
@Table(name = "pms_spu_info_desc", schema = "sunmall-pms", catalog = "")
public class PmsSpuInfoDescEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "spu_id")
    private long spuId;
    @Basic
    @Column(name = "descript")
    private String descript;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsSpuInfoDescEntity that = (PmsSpuInfoDescEntity) o;
        return spuId == that.spuId && Objects.equals(descript, that.descript);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spuId, descript);
    }
}
