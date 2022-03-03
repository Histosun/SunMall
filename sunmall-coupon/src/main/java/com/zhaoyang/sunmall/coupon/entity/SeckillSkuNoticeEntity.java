package com.zhaoyang.sunmall.coupon.entity;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Data
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
    @Type(type = "boolean")
    private Boolean noticeType;

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
