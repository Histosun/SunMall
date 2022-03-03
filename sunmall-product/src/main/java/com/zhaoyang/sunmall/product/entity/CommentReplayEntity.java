package com.zhaoyang.sunmall.product.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
@Table(name = "pms_comment_replay", schema = "sunmall-pms", catalog = "")
public class CommentReplayEntity {
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
        CommentReplayEntity that = (CommentReplayEntity) o;
        return id == that.id && Objects.equals(commentId, that.commentId) && Objects.equals(replyId, that.replyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, commentId, replyId);
    }
}
