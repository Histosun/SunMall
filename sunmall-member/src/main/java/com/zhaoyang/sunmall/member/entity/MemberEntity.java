package com.zhaoyang.sunmall.member.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ums_member", schema = "sunmall-ums", catalog = "")
public class MemberEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "level_id")
    private Long levelId;
    @Basic
    @Column(name = "username")
    private String username;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "nickname")
    private String nickname;
    @Basic
    @Column(name = "mobile")
    private String mobile;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "header")
    private String header;
    @Basic
    @Column(name = "gender")
    private Byte gender;
    @Basic
    @Column(name = "birth")
    private Date birth;
    @Basic
    @Column(name = "city")
    private String city;
    @Basic
    @Column(name = "job")
    private String job;
    @Basic
    @Column(name = "sign")
    private String sign;
    @Basic
    @Column(name = "source_type")
    private Byte sourceType;
    @Basic
    @Column(name = "integration")
    private Integer integration;
    @Basic
    @Column(name = "growth")
    private Integer growth;
    @Basic
    @Column(name = "status")
    private Byte status;
    @Basic
    @Column(name = "create_time")
    private Timestamp createTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getLevelId() {
        return levelId;
    }

    public void setLevelId(Long levelId) {
        this.levelId = levelId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Byte getSourceType() {
        return sourceType;
    }

    public void setSourceType(Byte sourceType) {
        this.sourceType = sourceType;
    }

    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberEntity that = (MemberEntity) o;
        return id == that.id && Objects.equals(levelId, that.levelId) && Objects.equals(username, that.username) && Objects.equals(password, that.password) && Objects.equals(nickname, that.nickname) && Objects.equals(mobile, that.mobile) && Objects.equals(email, that.email) && Objects.equals(header, that.header) && Objects.equals(gender, that.gender) && Objects.equals(birth, that.birth) && Objects.equals(city, that.city) && Objects.equals(job, that.job) && Objects.equals(sign, that.sign) && Objects.equals(sourceType, that.sourceType) && Objects.equals(integration, that.integration) && Objects.equals(growth, that.growth) && Objects.equals(status, that.status) && Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, levelId, username, password, nickname, mobile, email, header, gender, birth, city, job, sign, sourceType, integration, growth, status, createTime);
    }
}
