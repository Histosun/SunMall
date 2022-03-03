package com.zhaoyang.sunmall.member.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ums_integration_change_history", schema = "sunmall-ums", catalog = "")
public class IntegrationChangeHistoryEntity {
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
    @Column(name = "change_count")
    private Integer changeCount;
    @Basic
    @Column(name = "note")
    private String note;
    @Basic
    @Column(name = "source_tyoe")
    private Byte sourceTyoe;

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

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getChangeCount() {
        return changeCount;
    }

    public void setChangeCount(Integer changeCount) {
        this.changeCount = changeCount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Byte getSourceTyoe() {
        return sourceTyoe;
    }

    public void setSourceTyoe(Byte sourceTyoe) {
        this.sourceTyoe = sourceTyoe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntegrationChangeHistoryEntity that = (IntegrationChangeHistoryEntity) o;
        return id == that.id && Objects.equals(memberId, that.memberId) && Objects.equals(createTime, that.createTime) && Objects.equals(changeCount, that.changeCount) && Objects.equals(note, that.note) && Objects.equals(sourceTyoe, that.sourceTyoe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, memberId, createTime, changeCount, note, sourceTyoe);
    }
}
