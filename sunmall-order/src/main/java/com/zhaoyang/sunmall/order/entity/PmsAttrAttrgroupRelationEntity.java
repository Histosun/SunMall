package com.zhaoyang.sunmall.order.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
@Table(name = "pms_attr_attrgroup_relation", schema = "sunmall-oms", catalog = "")
public class PmsAttrAttrgroupRelationEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "attr_id")
    private Long attrId;
    @Basic
    @Column(name = "attr_group_id")
    private Long attrGroupId;
    @Basic
    @Column(name = "attr_sort")
    private Integer attrSort;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsAttrAttrgroupRelationEntity that = (PmsAttrAttrgroupRelationEntity) o;
        return id == that.id && Objects.equals(attrId, that.attrId) && Objects.equals(attrGroupId, that.attrGroupId) && Objects.equals(attrSort, that.attrSort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, attrId, attrGroupId, attrSort);
    }
}
