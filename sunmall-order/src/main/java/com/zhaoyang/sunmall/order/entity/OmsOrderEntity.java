package com.zhaoyang.sunmall.order.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Data
@Entity
@Table(name = "oms_order", schema = "sunmall-oms", catalog = "")
public class OmsOrderEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "member_id")
    private Long memberId;
    @Basic
    @Column(name = "order_sn")
    private String orderSn;
    @Basic
    @Column(name = "coupon_id")
    private Long couponId;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "member_username")
    private String memberUsername;
    @Basic
    @Column(name = "total_amount")
    private BigDecimal totalAmount;
    @Basic
    @Column(name = "pay_amount")
    private BigDecimal payAmount;
    @Basic
    @Column(name = "freight_amount")
    private BigDecimal freightAmount;
    @Basic
    @Column(name = "promotion_amount")
    private BigDecimal promotionAmount;
    @Basic
    @Column(name = "integration_amount")
    private BigDecimal integrationAmount;
    @Basic
    @Column(name = "coupon_amount")
    private BigDecimal couponAmount;
    @Basic
    @Column(name = "discount_amount")
    private BigDecimal discountAmount;
    @Basic
    @Column(name = "pay_type")
    private Byte payType;
    @Basic
    @Column(name = "source_type")
    private Byte sourceType;
    @Basic
    @Column(name = "status")
    private Byte status;
    @Basic
    @Column(name = "delivery_company")
    private String deliveryCompany;
    @Basic
    @Column(name = "delivery_sn")
    private String deliverySn;
    @Basic
    @Column(name = "auto_confirm_day")
    private Integer autoConfirmDay;
    @Basic
    @Column(name = "integration")
    private Integer integration;
    @Basic
    @Column(name = "growth")
    private Integer growth;
    @Basic
    @Column(name = "bill_type")
    private Byte billType;
    @Basic
    @Column(name = "bill_header")
    private String billHeader;
    @Basic
    @Column(name = "bill_content")
    private String billContent;
    @Basic
    @Column(name = "bill_receiver_phone")
    private String billReceiverPhone;
    @Basic
    @Column(name = "bill_receiver_email")
    private String billReceiverEmail;
    @Basic
    @Column(name = "receiver_name")
    private String receiverName;
    @Basic
    @Column(name = "receiver_phone")
    private String receiverPhone;
    @Basic
    @Column(name = "receiver_post_code")
    private String receiverPostCode;
    @Basic
    @Column(name = "receiver_province")
    private String receiverProvince;
    @Basic
    @Column(name = "receiver_city")
    private String receiverCity;
    @Basic
    @Column(name = "receiver_region")
    private String receiverRegion;
    @Basic
    @Column(name = "receiver_detail_address")
    private String receiverDetailAddress;
    @Basic
    @Column(name = "note")
    private String note;
    @Basic
    @Column(name = "confirm_status")
    private Byte confirmStatus;
    @Basic
    @Column(name = "delete_status")
    private Byte deleteStatus;
    @Basic
    @Column(name = "use_integration")
    private Integer useIntegration;
    @Basic
    @Column(name = "payment_time")
    private Timestamp paymentTime;
    @Basic
    @Column(name = "delivery_time")
    private Timestamp deliveryTime;
    @Basic
    @Column(name = "receive_time")
    private Timestamp receiveTime;
    @Basic
    @Column(name = "comment_time")
    private Timestamp commentTime;
    @Basic
    @Column(name = "modify_time")
    private Timestamp modifyTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OmsOrderEntity that = (OmsOrderEntity) o;
        return id == that.id && Objects.equals(memberId, that.memberId) && Objects.equals(orderSn, that.orderSn) && Objects.equals(couponId, that.couponId) && Objects.equals(createTime, that.createTime) && Objects.equals(memberUsername, that.memberUsername) && Objects.equals(totalAmount, that.totalAmount) && Objects.equals(payAmount, that.payAmount) && Objects.equals(freightAmount, that.freightAmount) && Objects.equals(promotionAmount, that.promotionAmount) && Objects.equals(integrationAmount, that.integrationAmount) && Objects.equals(couponAmount, that.couponAmount) && Objects.equals(discountAmount, that.discountAmount) && Objects.equals(payType, that.payType) && Objects.equals(sourceType, that.sourceType) && Objects.equals(status, that.status) && Objects.equals(deliveryCompany, that.deliveryCompany) && Objects.equals(deliverySn, that.deliverySn) && Objects.equals(autoConfirmDay, that.autoConfirmDay) && Objects.equals(integration, that.integration) && Objects.equals(growth, that.growth) && Objects.equals(billType, that.billType) && Objects.equals(billHeader, that.billHeader) && Objects.equals(billContent, that.billContent) && Objects.equals(billReceiverPhone, that.billReceiverPhone) && Objects.equals(billReceiverEmail, that.billReceiverEmail) && Objects.equals(receiverName, that.receiverName) && Objects.equals(receiverPhone, that.receiverPhone) && Objects.equals(receiverPostCode, that.receiverPostCode) && Objects.equals(receiverProvince, that.receiverProvince) && Objects.equals(receiverCity, that.receiverCity) && Objects.equals(receiverRegion, that.receiverRegion) && Objects.equals(receiverDetailAddress, that.receiverDetailAddress) && Objects.equals(note, that.note) && Objects.equals(confirmStatus, that.confirmStatus) && Objects.equals(deleteStatus, that.deleteStatus) && Objects.equals(useIntegration, that.useIntegration) && Objects.equals(paymentTime, that.paymentTime) && Objects.equals(deliveryTime, that.deliveryTime) && Objects.equals(receiveTime, that.receiveTime) && Objects.equals(commentTime, that.commentTime) && Objects.equals(modifyTime, that.modifyTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, memberId, orderSn, couponId, createTime, memberUsername, totalAmount, payAmount, freightAmount, promotionAmount, integrationAmount, couponAmount, discountAmount, payType, sourceType, status, deliveryCompany, deliverySn, autoConfirmDay, integration, growth, billType, billHeader, billContent, billReceiverPhone, billReceiverEmail, receiverName, receiverPhone, receiverPostCode, receiverProvince, receiverCity, receiverRegion, receiverDetailAddress, note, confirmStatus, deleteStatus, useIntegration, paymentTime, deliveryTime, receiveTime, commentTime, modifyTime);
    }
}
