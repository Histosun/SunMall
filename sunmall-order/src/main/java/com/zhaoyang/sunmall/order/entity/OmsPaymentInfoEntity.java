package com.zhaoyang.sunmall.order.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Data
@Entity
@Table(name = "oms_payment_info", schema = "sunmall-oms", catalog = "")
public class OmsPaymentInfoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "order_sn")
    private String orderSn;
    @Basic
    @Column(name = "order_id")
    private Long orderId;
    @Basic
    @Column(name = "alipay_trade_no")
    private String alipayTradeNo;
    @Basic
    @Column(name = "total_amount")
    private BigDecimal totalAmount;
    @Basic
    @Column(name = "subject")
    private String subject;
    @Basic
    @Column(name = "payment_status")
    private String paymentStatus;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "confirm_time")
    private Timestamp confirmTime;
    @Basic
    @Column(name = "callback_content")
    private String callbackContent;
    @Basic
    @Column(name = "callback_time")
    private Timestamp callbackTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OmsPaymentInfoEntity that = (OmsPaymentInfoEntity) o;
        return id == that.id && Objects.equals(orderSn, that.orderSn) && Objects.equals(orderId, that.orderId) && Objects.equals(alipayTradeNo, that.alipayTradeNo) && Objects.equals(totalAmount, that.totalAmount) && Objects.equals(subject, that.subject) && Objects.equals(paymentStatus, that.paymentStatus) && Objects.equals(createTime, that.createTime) && Objects.equals(confirmTime, that.confirmTime) && Objects.equals(callbackContent, that.callbackContent) && Objects.equals(callbackTime, that.callbackTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderSn, orderId, alipayTradeNo, totalAmount, subject, paymentStatus, createTime, confirmTime, callbackContent, callbackTime);
    }
}
