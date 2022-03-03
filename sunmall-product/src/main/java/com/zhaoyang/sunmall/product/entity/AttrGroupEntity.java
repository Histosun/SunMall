package com.zhaoyang.sunmall.product.entity;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
@Table(name = "pms_attr_group", schema = "sunmall-pms", catalog = "")
public class AttrGroupEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "attr_group_id")
    private long attrGroupId;
    @Basic
    @Column(name = "attr_group_name")
    @Type(type = "char")
    private String attrGroupName;
    @Basic
    @Column(name = "sort")
    private Integer sort;
    @Basic
    @Column(name = "descript")
    private String descript;
    @Basic
    @Column(name = "icon")
    private String icon;
    @Basic
    @Column(name = "catelog_id")
    private Long catelogId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttrGroupEntity that = (AttrGroupEntity) o;
        return attrGroupId == that.attrGroupId && Objects.equals(attrGroupName, that.attrGroupName) && Objects.equals(sort, that.sort) && Objects.equals(descript, that.descript) && Objects.equals(icon, that.icon) && Objects.equals(catelogId, that.catelogId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attrGroupId, attrGroupName, sort, descript, icon, catelogId);
    }
}
