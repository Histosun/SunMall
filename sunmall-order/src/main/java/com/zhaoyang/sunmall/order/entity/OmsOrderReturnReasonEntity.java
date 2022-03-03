package com.zhaoyang.sunmall.order.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Data
@Entity
@Table(name = "oms_order_return_reason", schema = "sunmall-oms", catalog = "")
public class OmsOrderReturnReasonEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "sort")
    private Integer sort;
    @Basic
    @Column(name = "status")
    private Byte status;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OmsOrderReturnReasonEntity that = (OmsOrderReturnReasonEntity) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(sort, that.sort) && Objects.equals(status, that.status) && Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sort, status, createTime);
    }
}
