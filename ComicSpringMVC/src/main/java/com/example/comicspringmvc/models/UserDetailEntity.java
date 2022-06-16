package com.example.comicspringmvc.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "UserDetail")
public class UserDetailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserDetailId")
    private Long userDetailId;

    @Column(name = "FullName", nullable = false)
    private String fullName;

    @Column(name = "Birthday")
    private LocalDate birthDay;

    @Column(name = "Sex")
    private Integer sex;

    @Column(name = "Mail", nullable = false)
    private String mail;

    public UserDetailEntity() {
    }

    public Long getUserDetailId() {
        return userDetailId;
    }

    public void setUserDetailId(Long userDetailId) {
        this.userDetailId = userDetailId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userDetailId=" + userDetailId +
                ", fullName='" + fullName + '\'' +
                ", birthDay=" + birthDay +
                ", sex='" + sex + '\'' +
                ", mail='" + mail +
                '}';
    }
}
