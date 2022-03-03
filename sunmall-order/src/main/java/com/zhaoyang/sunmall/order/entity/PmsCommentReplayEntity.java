package com.zhaoyang.sunmall.order.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
@Table(name = "pms_comment_replay", schema = "sunmall-oms", catalog = "")
public class PmsCommentReplayEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "comment_id")
    private Long commentId;
    @Basic
    @Column(name = "reply_id")
    private Long replyId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PmsCommentReplayEntity that = (PmsCommentReplayEntity) o;
        return id == that.id && Objects.equals(commentId, that.commentId) && Objects.equals(replyId, that.replyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, commentId, replyId);
    }
}
