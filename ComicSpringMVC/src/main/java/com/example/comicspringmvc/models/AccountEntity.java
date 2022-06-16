package com.example.comicspringmvc.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Account")
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AccountId")
    private Long accountId;

    @Column(name = "Username", nullable = false)
    private String userName;

    @Column(name = "Password", nullable = false)
    private String password;

    @Column(name = "CreatedDate", nullable = false)
    private LocalDate createdDate;

    @Column(name = "Role", columnDefinition = "integer default 0", nullable = false)
    private Integer role = 0;

    @Column(name = "Status", columnDefinition = "integer default 1", nullable = false)
    private Integer status = 1;

    @ManyToOne(optional = false)
    @JoinColumn(name = "TranslateTeamId", foreignKey = @ForeignKey(name = "FK_Account_TranslateTeam"))
    private TranslateTeamEntity translateTeam;

    @OneToOne(optional = false)
    @JoinColumn(name = "UserDetailId", foreignKey = @ForeignKey(name = "FK_Account_UserDetail"))
    private UserDetailEntity userDetail;

    public AccountEntity() {
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String passWord) {
        this.password = passWord;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public TranslateTeamEntity getTranslateTeam() {
        return translateTeam;
    }

    public void setTranslateTeam(TranslateTeamEntity translateTeam) {
        this.translateTeam = translateTeam;
    }

    @Override
    public String toString() {
        return "AccountEntity{" +
                "accountId=" + accountId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", createdDate=" + createdDate +
                ", role=" + role +
                ", status=" + status +
                ", translateTeam=" + translateTeam +
                ", userDetail=" + userDetail +
                '}';
    }
}
