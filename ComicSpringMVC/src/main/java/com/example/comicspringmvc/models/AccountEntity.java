package com.example.comicspringmvc.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "Account")
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AccountId")
    private Long accountId;

    @Column(name = "Email", nullable = false, unique = true)
    private String email;

    @Column(name = "Password", nullable = false)
    private String password;

    @Column(name = "CreatedDate", nullable = false)
    private LocalDate createdDate;

    @Column(name = "FullName", nullable = false)
    private String fullName;

    @Column(name = "Birthday")
    private LocalDate birthDay;

    @Column(name = "Sex")
    private Integer sex;

    @Column(name = "Role", columnDefinition = "integer default 0", nullable = false)
    private Integer role = 0;

    @Column(name = "Status", columnDefinition = "integer default 1", nullable = false)
    private Integer status = 1;

    @ManyToOne(optional = false)
    @JoinColumn(name = "TranslateTeamId", foreignKey = @ForeignKey(name = "FK_Account_TranslateTeam"))
    private TranslateTeamEntity translateTeam;

    @ManyToMany
    @JoinTable(name = "account_role_entities",
            joinColumns = @JoinColumn(name = "account_entity_account_id"),
            inverseJoinColumns = @JoinColumn(name = "role_entities_role_id"))
    private Set<RoleEntity> roles = new LinkedHashSet<>();

    public Set<RoleEntity> getRoles() {
        return roles;
    }

    public void setRoles(Set<RoleEntity> roles) {
        this.roles = roles;
    }

    public AccountEntity() {
    }


    public AccountEntity(Long accountId, String email, String password, LocalDate createdDate, String fullName, LocalDate birthDay, Integer sex, Integer role, Integer status, TranslateTeamEntity translateTeam, Set<RoleEntity> roles) {
        this.accountId = accountId;
        this.email = email;
        this.password = password;
        this.createdDate = createdDate;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.sex = sex;
        this.role = role;
        this.status = status;
        this.translateTeam = translateTeam;
        this.roles = roles;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
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

//    public Integer getRole() {
//        return role;
//    }
//
//    public void setRole(Integer role) {
//        this.role = role;
//    }

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
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", createdDate=" + createdDate +
                ", fullName='" + fullName + '\'' +
                ", birthDay=" + birthDay +
                ", sex=" + sex +
                ", role=" + role +
                ", status=" + status +
                ", translateTeam=" + translateTeam +
                '}';
    }
}
