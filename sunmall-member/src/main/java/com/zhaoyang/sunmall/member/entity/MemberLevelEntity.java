package com.zhaoyang.sunmall.member.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "ums_member_level", schema = "sunmall-ums", catalog = "")
public class MemberLevelEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "growth_point")
    private Integer growthPoint;
    @Basic
    @Column(name = "default_status")
    private Byte defaultStatus;
    @Basic
    @Column(name = "free_freight_point")
    private BigDecimal freeFreightPoint;
    @Basic
    @Column(name = "comment_growth_point")
    private Integer commentGrowthPoint;
    @Basic
    @Column(name = "priviledge_free_freight")
    private Byte priviledgeFreeFreight;
    @Basic
    @Column(name = "priviledge_member_price")
    private Byte priviledgeMemberPrice;
    @Basic
    @Column(name = "priviledge_birthday")
    private Byte priviledgeBirthday;
    @Basic
    @Column(name = "note")
    private String note;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrowthPoint() {
        return growthPoint;
    }

    public void setGrowthPoint(Integer growthPoint) {
        this.growthPoint = growthPoint;
    }

    public Byte getDefaultStatus() {
        return defaultStatus;
    }

    public void setDefaultStatus(Byte defaultStatus) {
        this.defaultStatus = defaultStatus;
    }

    public BigDecimal getFreeFreightPoint() {
        return freeFreightPoint;
    }

    public void setFreeFreightPoint(BigDecimal freeFreightPoint) {
        this.freeFreightPoint = freeFreightPoint;
    }

    public Integer getCommentGrowthPoint() {
        return commentGrowthPoint;
    }

    public void setCommentGrowthPoint(Integer commentGrowthPoint) {
        this.commentGrowthPoint = commentGrowthPoint;
    }

    public Byte getPriviledgeFreeFreight() {
        return priviledgeFreeFreight;
    }

    public void setPriviledgeFreeFreight(Byte priviledgeFreeFreight) {
        this.priviledgeFreeFreight = priviledgeFreeFreight;
    }

    public Byte getPriviledgeMemberPrice() {
        return priviledgeMemberPrice;
    }

    public void setPriviledgeMemberPrice(Byte priviledgeMemberPrice) {
        this.priviledgeMemberPrice = priviledgeMemberPrice;
    }

    public Byte getPriviledgeBirthday() {
        return priviledgeBirthday;
    }

    public void setPriviledgeBirthday(Byte priviledgeBirthday) {
        this.priviledgeBirthday = priviledgeBirthday;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberLevelEntity that = (MemberLevelEntity) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(growthPoint, that.growthPoint) && Objects.equals(defaultStatus, that.defaultStatus) && Objects.equals(freeFreightPoint, that.freeFreightPoint) && Objects.equals(commentGrowthPoint, that.commentGrowthPoint) && Objects.equals(priviledgeFreeFreight, that.priviledgeFreeFreight) && Objects.equals(priviledgeMemberPrice, that.priviledgeMemberPrice) && Objects.equals(priviledgeBirthday, that.priviledgeBirthday) && Objects.equals(note, that.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, growthPoint, defaultStatus, freeFreightPoint, commentGrowthPoint, priviledgeFreeFreight, priviledgeMemberPrice, priviledgeBirthday, note);
    }
}
