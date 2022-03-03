package com.zhaoyang.sunmall.order.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Data
@Entity
@Table(name = "oms_order_return_apply", schema = "sunmall-oms", catalog = "")
public class OmsOrderReturnApplyEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "order_id")
    private Long orderId;
    @Basic
    @Column(name = "sku_id")
    private Long skuId;
    @Basic
    @Column(name = "order_sn")
    private String orderSn;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "member_username")
    private String memberUsername;
    @Basic
    @Column(name = "return_amount")
    private BigDecimal returnAmount;
    @Basic
    @Column(name = "return_name")
    private String returnName;
    @Basic
    @Column(name = "return_phone")
    private String returnPhone;
    @Basic
    @Column(name = "status")
    private Byte status;
    @Basic
    @Column(name = "handle_time")
    private Timestamp handleTime;
    @Basic
    @Column(name = "sku_img")
    private String skuImg;
    @Basic
    @Column(name = "sku_name")
    private String skuName;
    @Basic
    @Column(name = "sku_brand")
    private String skuBrand;
    @Basic
    @Column(name = "sku_attrs_vals")
    private String skuAttrsVals;
    @Basic
    @Column(name = "sku_count")
    private Integer skuCount;
    @Basic
    @Column(name = "sku_price")
    private BigDecimal skuPrice;
    @Basic
    @Column(name = "sku_real_price")
    private BigDecimal skuRealPrice;
    @Basic
    @Column(name = "reason")
    private String reason;
    @Basic
    @Column(name = "description述")
    private String description述;
    @Basic
    @Column(name = "desc_pics")
    private String descPics;
    @Basic
    @Column(name = "handle_note")
    private String handleNote;
    @Basic
    @Column(name = "handle_man")
    private String handleMan;
    @Basic
    @Column(name = "receive_man")
    private String receiveMan;
    @Basic
    @Column(name = "receive_time")
    private Timestamp receiveTime;
    @Basic
    @Column(name = "receive_note")
    private String receiveNote;
    @Basic
    @Column(name = "receive_phone")
    private String receivePhone;
    @Basic
    @Column(name = "company_address")
    private String companyAddress;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OmsOrderReturnApplyEntity that = (OmsOrderReturnApplyEntity) o;
        return id == that.id && Objects.equals(orderId, that.orderId) && Objects.equals(skuId, that.skuId) && Objects.equals(orderSn, that.orderSn) && Objects.equals(createTime, that.createTime) && Objects.equals(memberUsername, that.memberUsername) && Objects.equals(returnAmount, that.returnAmount) && Objects.equals(returnName, that.returnName) && Objects.equals(returnPhone, that.returnPhone) && Objects.equals(status, that.status) && Objects.equals(handleTime, that.handleTime) && Objects.equals(skuImg, that.skuImg) && Objects.equals(skuName, that.skuName) && Objects.equals(skuBrand, that.skuBrand) && Objects.equals(skuAttrsVals, that.skuAttrsVals) && Objects.equals(skuCount, that.skuCount) && Objects.equals(skuPrice, that.skuPrice) && Objects.equals(skuRealPrice, that.skuRealPrice) && Objects.equals(reason, that.reason) && Objects.equals(description述, that.description述) && Objects.equals(descPics, that.descPics) && Objects.equals(handleNote, that.handleNote) && Objects.equals(handleMan, that.handleMan) && Objects.equals(receiveMan, that.receiveMan) && Objects.equals(receiveTime, that.receiveTime) && Objects.equals(receiveNote, that.receiveNote) && Objects.equals(receivePhone, that.receivePhone) && Objects.equals(companyAddress, that.companyAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderId, skuId, orderSn, createTime, memberUsername, returnAmount, returnName, returnPhone, status, handleTime, skuImg, skuName, skuBrand, skuAttrsVals, skuCount, skuPrice, skuRealPrice, reason, description述, descPics, handleNote, handleMan, receiveMan, receiveTime, receiveNote, receivePhone, companyAddress);
    }
}
