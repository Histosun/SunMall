package com.zhaoyang.sunmall.order.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
@Table(name = "pms_attr", schema = "sunmall-oms", catalog = "")
public class PmsAttrEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "attr_id")
    private long attrId;
    @Basic
    @Column(name = "attr_name")
    private String attrName;
    @Basic
    @Column(name = "search_type")
    private Byte searchType;
    @Basic
    @Column(name = "icon")
    private String icon;
    @Basic
    @Column(name = "value_select")
    private String valueSelect;
    @Basic
    @Column(name = "attr_type")
    private Byte attrType;
    @Basic
    @Column(name = "enable")
    private Long enable;
    @Basic
    @Column(name = "catelog_id")
    private Long catelogId;
    @Basic
    @Column(name = "show_desc")
    private Byte showDesc;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsAttrEntity that = (PmsAttrEntity) o;
        return attrId == that.attrId && Objects.equals(attrName, that.attrName) && Objects.equals(searchType, that.searchType) && Objects.equals(icon, that.icon) && Objects.equals(valueSelect, that.valueSelect) && Objects.equals(attrType, that.attrType) && Objects.equals(enable, that.enable) && Objects.equals(catelogId, that.catelogId) && Objects.equals(showDesc, that.showDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attrId, attrName, searchType, icon, valueSelect, attrType, enable, catelogId, showDesc);
    }
}
