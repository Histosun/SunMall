package com.zhaoyang.sunmall.order.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
@Table(name = "oms_order_setting", schema = "sunmall-oms", catalog = "")
public class OmsOrderSettingEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "flash_order_overtime")
    private Integer flashOrderOvertime;
    @Basic
    @Column(name = "normal_order_overtime")
    private Integer normalOrderOvertime;
    @Basic
    @Column(name = "confirm_overtime")
    private Integer confirmOvertime;
    @Basic
    @Column(name = "finish_overtime")
    private Integer finishOvertime;
    @Basic
    @Column(name = "comment_overtime")
    private Integer commentOvertime;
    @Basic
    @Column(name = "member_level")
    private Byte memberLevel;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OmsOrderSettingEntity that = (OmsOrderSettingEntity) o;
        return id == that.id && Objects.equals(flashOrderOvertime, that.flashOrderOvertime) && Objects.equals(normalOrderOvertime, that.normalOrderOvertime) && Objects.equals(confirmOvertime, that.confirmOvertime) && Objects.equals(finishOvertime, that.finishOvertime) && Objects.equals(commentOvertime, that.commentOvertime) && Objects.equals(memberLevel, that.memberLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, flashOrderOvertime, normalOrderOvertime, confirmOvertime, finishOvertime, commentOvertime, memberLevel);
    }
}
