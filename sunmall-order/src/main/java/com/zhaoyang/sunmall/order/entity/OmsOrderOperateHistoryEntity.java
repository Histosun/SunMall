package com.zhaoyang.sunmall.order.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Data
@Entity
@Table(name = "oms_order_operate_history", schema = "sunmall-oms", catalog = "")
public class OmsOrderOperateHistoryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "order_id")
    private Long orderId;
    @Basic
    @Column(name = "operate_man")
    private String operateMan;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "order_status")
    private Byte orderStatus;
    @Basic
    @Column(name = "note")
    private String note;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OmsOrderOperateHistoryEntity that = (OmsOrderOperateHistoryEntity) o;
        return id == that.id && Objects.equals(orderId, that.orderId) && Objects.equals(operateMan, that.operateMan) && Objects.equals(createTime, that.createTime) && Objects.equals(orderStatus, that.orderStatus) && Objects.equals(note, that.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderId, operateMan, createTime, orderStatus, note);
    }
}
