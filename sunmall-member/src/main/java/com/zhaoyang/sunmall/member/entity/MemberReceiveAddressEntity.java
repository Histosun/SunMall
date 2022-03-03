package com.zhaoyang.sunmall.member.entity;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
@Table(name = "ums_member_receive_address", schema = "sunmall-ums", catalog = "")
public class MemberReceiveAddressEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "member_id")
    private Long memberId;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "phone")
    private String phone;
    @Basic
    @Column(name = "post_code")
    private String postCode;
    @Basic
    @Column(name = "province")
    private String province;
    @Basic
    @Column(name = "city")
    private String city;
    @Basic
    @Column(name = "region")
    private String region;
    @Basic
    @Column(name = "detail_address")
    private String detailAddress;
    @Basic
    @Column(name = "areacode")
    private String areacode;
    @Basic
    @Column(name = "default_status")
    @Type(type = "boolean")
    private Boolean defaultStatus;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberReceiveAddressEntity that = (MemberReceiveAddressEntity) o;
        return id == that.id && Objects.equals(memberId, that.memberId) && Objects.equals(name, that.name) && Objects.equals(phone, that.phone) && Objects.equals(postCode, that.postCode) && Objects.equals(province, that.province) && Objects.equals(city, that.city) && Objects.equals(region, that.region) && Objects.equals(detailAddress, that.detailAddress) && Objects.equals(areacode, that.areacode) && Objects.equals(defaultStatus, that.defaultStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, memberId, name, phone, postCode, province, city, region, detailAddress, areacode, defaultStatus);
    }
}
