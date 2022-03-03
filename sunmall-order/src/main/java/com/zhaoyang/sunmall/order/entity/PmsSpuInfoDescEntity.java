package com.zhaoyang.sunmall.order.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
@Table(name = "pms_spu_info_desc", schema = "sunmall-oms", catalog = "")
public class PmsSpuInfoDescEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "spu_id")
    private long spuId;
    @Basic
    @Column(name = "decript")
    private String decript;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsSpuInfoDescEntity that = (PmsSpuInfoDescEntity) o;
        return spuId == that.spuId && Objects.equals(decript, that.decript);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spuId, decript);
    }
}
