package com.zhaoyang.sunmall.member.entity;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Data
@Entity
@Table(name = "ums_member_login_log", schema = "sunmall-ums", catalog = "")
public class MemberLoginLogEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "member_id")
    private Long memberId;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "ip")
    private String ip;
    @Basic
    @Column(name = "city")
    private String city;
    @Basic
    @Column(name = "login_type")
    @Type(type = "boolean")
    private Boolean loginType;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberLoginLogEntity that = (MemberLoginLogEntity) o;
        return id == that.id && Objects.equals(memberId, that.memberId) && Objects.equals(createTime, that.createTime) && Objects.equals(ip, that.ip) && Objects.equals(city, that.city) && Objects.equals(loginType, that.loginType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, memberId, createTime, ip, city, loginType);
    }
}
