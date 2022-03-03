package com.zhaoyang.sunmall.order.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Data
@Entity
@Table(name = "pms_spu_comment", schema = "sunmall-oms", catalog = "")
public class PmsSpuCommentEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "sku_id")
    private Long skuId;
    @Basic
    @Column(name = "spu_id")
    private Long spuId;
    @Basic
    @Column(name = "spu_name")
    private String spuName;
    @Basic
    @Column(name = "member_nick_name")
    private String memberNickName;
    @Basic
    @Column(name = "star")
    private Byte star;
    @Basic
    @Column(name = "member_ip")
    private String memberIp;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;
    @Basic
    @Column(name = "show_status")
    private Byte showStatus;
    @Basic
    @Column(name = "spu_attributes")
    private String spuAttributes;
    @Basic
    @Column(name = "likes_count")
    private Integer likesCount;
    @Basic
    @Column(name = "reply_count")
    private Integer replyCount;
    @Basic
    @Column(name = "resources")
    private String resources;
    @Basic
    @Column(name = "content")
    private String content;
    @Basic
    @Column(name = "member_icon")
    private String memberIcon;
    @Basic
    @Column(name = "comment_type")
    private Byte commentType;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsSpuCommentEntity that = (PmsSpuCommentEntity) o;
        return id == that.id && Objects.equals(skuId, that.skuId) && Objects.equals(spuId, that.spuId) && Objects.equals(spuName, that.spuName) && Objects.equals(memberNickName, that.memberNickName) && Objects.equals(star, that.star) && Objects.equals(memberIp, that.memberIp) && Objects.equals(createTime, that.createTime) && Objects.equals(showStatus, that.showStatus) && Objects.equals(spuAttributes, that.spuAttributes) && Objects.equals(likesCount, that.likesCount) && Objects.equals(replyCount, that.replyCount) && Objects.equals(resources, that.resources) && Objects.equals(content, that.content) && Objects.equals(memberIcon, that.memberIcon) && Objects.equals(commentType, that.commentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, skuId, spuId, spuName, memberNickName, star, memberIp, createTime, showStatus, spuAttributes, likesCount, replyCount, resources, content, memberIcon, commentType);
    }
}
