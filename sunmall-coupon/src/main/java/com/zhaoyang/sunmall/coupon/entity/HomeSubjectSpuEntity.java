package com.zhaoyang.sunmall.coupon.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sms_home_subject_spu", schema = "sunmall-sms", catalog = "")
public class HomeSubjectSpuEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "subject_id")
    private Long subjectId;
    @Basic
    @Column(name = "spu_id")
    private Long spuId;
    @Basic
    @Column(name = "sort")
    private Integer sort;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HomeSubjectSpuEntity that = (HomeSubjectSpuEntity) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(subjectId, that.subjectId) && Objects.equals(spuId, that.spuId) && Objects.equals(sort, that.sort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, subjectId, spuId, sort);
    }
}
