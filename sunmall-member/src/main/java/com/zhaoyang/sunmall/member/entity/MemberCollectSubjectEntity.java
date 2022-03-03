package com.zhaoyang.sunmall.member.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ums_member_collect_subject", schema = "sunmall-ums", catalog = "")
public class MemberCollectSubjectEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "subject_id")
    private Long subjectId;
    @Basic
    @Column(name = "subject_name")
    private String subjectName;
    @Basic
    @Column(name = "subject_img")
    private String subjectImg;
    @Basic
    @Column(name = "subject_urll")
    private String subjectUrll;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectImg() {
        return subjectImg;
    }

    public void setSubjectImg(String subjectImg) {
        this.subjectImg = subjectImg;
    }

    public String getSubjectUrll() {
        return subjectUrll;
    }

    public void setSubjectUrll(String subjectUrll) {
        this.subjectUrll = subjectUrll;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberCollectSubjectEntity that = (MemberCollectSubjectEntity) o;
        return id == that.id && Objects.equals(subjectId, that.subjectId) && Objects.equals(subjectName, that.subjectName) && Objects.equals(subjectImg, that.subjectImg) && Objects.equals(subjectUrll, that.subjectUrll);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, subjectId, subjectName, subjectImg, subjectUrll);
    }
}
