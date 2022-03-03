package com.zhaoyang.sunmall.order.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Data
@Entity
@Table(name = "oms_refund_info", schema = "sunmall-oms", catalog = "")
public class OmsRefundInfoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "order_return_id")
    private Long orderReturnId;
    @Basic
    @Column(name = "refund")
    private BigDecimal refund;
    @Basic
    @Column(name = "refund_sn")
    private String refundSn;
    @Basic
    @Column(name = "refund_status")
    private Byte refundStatus;
    @Basic
    @Column(name = "refund_channel")
    private Byte refundChannel;
    @Basic
    @Column(name = "refund_content")
    private String refundContent;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OmsRefundInfoEntity that = (OmsRefundInfoEntity) o;
        return id == that.id && Objects.equals(orderReturnId, that.orderReturnId) && Objects.equals(refund, that.refund) && Objects.equals(refundSn, that.refundSn) && Objects.equals(refundStatus, that.refundStatus) && Objects.equals(refundChannel, that.refundChannel) && Objects.equals(refundContent, that.refundContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderReturnId, refund, refundSn, refundStatus, refundChannel, refundContent);
    }
}
