package com.example.comicspringmvc.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "UserDetail")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserDetailId")
    private Long userDetailId;

    @Column(name = "FullName", nullable = false)
    private String fullName;

    @Column(name = "Birthday")
    private LocalDate birthDay;

    @Column(name = "Sex")
    private String sex;

    @Column(name = "Mail", nullable = false)
    private String mail;

    @OneToOne(optional = false)
    @JoinColumn(name = "AccountId", foreignKey = @ForeignKey(name = "FK_User_Account"))
    private AccountEntity account;


    public UserEntity() {
    }

    public UserEntity(Long userDetailId, String fullName, LocalDate birthDay, String sex, String mail, AccountEntity account) {
        this.userDetailId = userDetailId;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.sex = sex;
        this.mail = mail;
        this.account = account;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public AccountEntity getAccount() {
        return account;
    }

    public void setAccount(AccountEntity account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userDetailId=" + userDetailId +
                ", fullName='" + fullName + '\'' +
                ", birthDay=" + birthDay +
                ", sex='" + sex + '\'' +
                ", mail='" + mail + '\'' +
                ", account=" + account +
                '}';
    }
}
