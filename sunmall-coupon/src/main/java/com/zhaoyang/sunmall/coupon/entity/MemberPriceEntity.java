package com.zhaoyang.sunmall.coupon.entity;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Data
@Entity
@Table(name = "sms_member_price", schema = "sunmall-sms", catalog = "")
public class MemberPriceEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "sku_id")
    private Long skuId;
    @Basic
    @Column(name = "member_level_id")
    private Long memberLevelId;
    @Basic
    @Column(name = "member_level_name")
    private String memberLevelName;
    @Basic
    @Column(name = "member_price")
    private BigDecimal memberPrice;
    @Basic
    @Column(name = "add_other")
    @Type(type = "boolean")
    private Boolean addOther;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberPriceEntity that = (MemberPriceEntity) o;
        return id == that.id && Objects.equals(skuId, that.skuId) && Objects.equals(memberLevelId, that.memberLevelId) && Objects.equals(memberLevelName, that.memberLevelName) && Objects.equals(memberPrice, that.memberPrice) && Objects.equals(addOther, that.addOther);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, skuId, memberLevelId, memberLevelName, memberPrice, addOther);
    }
}
