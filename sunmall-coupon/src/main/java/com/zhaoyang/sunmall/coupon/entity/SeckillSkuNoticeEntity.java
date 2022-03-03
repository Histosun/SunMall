package com.zhaoyang.sunmall.coupon.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sms_seckill_sku_notice", schema = "sunmall-sms", catalog = "")
public class SeckillSkuNoticeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "member_id")
    private Long memberId;
    @Basic
    @Column(name = "sku_id")
    private Long skuId;
    @Basic
    @Column(name = "session_id")
    private Long sessionId;
    @Basic
    @Column(name = "subcribe_time")
    private Timestamp subcribeTime;
    @Basic
    @Column(name = "send_time")
    private Timestamp sendTime;
    @Basic
    @Column(name = "notice_type")
    private Byte noticeType;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSessionId() {
        return sessionId;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }

    public Timestamp getSubcribeTime() {
        return subcribeTime;
    }

    public void setSubcribeTime(Timestamp subcribeTime) {
        this.subcribeTime = subcribeTime;
    }

    public Timestamp getSendTime() {
        return sendTime;
    }

    public void setSendTime(Timestamp sendTime) {
        this.sendTime = sendTime;
    }

    public Byte getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(Byte noticeType) {
        this.noticeType = noticeType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeckillSkuNoticeEntity that = (SeckillSkuNoticeEntity) o;
        return id == that.id && Objects.equals(memberId, that.memberId) && Objects.equals(skuId, that.skuId) && Objects.equals(sessionId, that.sessionId) && Objects.equals(subcribeTime, that.subcribeTime) && Objects.equals(sendTime, that.sendTime) && Objects.equals(noticeType, that.noticeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, memberId, skuId, sessionId, subcribeTime, sendTime, noticeType);
    }
}
