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

    @Column(name = "FullName", nullable = false)
    private String fullName;

    @Column(name = "Birthday")
    private LocalDate birthDay;

    @Column(name = "Sex")
    private Integer sex;

    @Column(name = "CreatedDate", nullable = false)
    private LocalDate createdDate;

    @Column(name = "ModifiedDate")
    private LocalDate modifiedDate;

    @Column(name = "CreatedBy")
    private Long createdBy;

    @Column(name = "ModifiedBy")
    private Long modifiedBy;

    @Column(name = "Status", columnDefinition = "integer default 1")
    private Integer status = 1;

    @ManyToOne(optional = true)
    @JoinColumn(name = "TranslateTeamId", nullable = true, columnDefinition = "bigint default null", foreignKey = @ForeignKey(name = "FK_Account_TranslateTeam"))
//    @Column(name = "TranslateTeamId", columnDefinition = "bigint default null")
    private TranslateTeamEntity translateTeam;

    @ManyToMany(fetch = FetchType.EAGER)
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

    public AccountEntity(Long accountId) {
        this.accountId = accountId;
    }

    public AccountEntity(AccountEntity temp) {
        this.accountId = temp.accountId;
        this.email = temp.email;
        this.password = temp.password;
        this.fullName = temp.fullName;
        this.birthDay = temp.birthDay;
        this.sex = temp.sex;
        this.createdDate = temp.createdDate;
        this.modifiedDate = temp.modifiedDate;
        this.createdBy = temp.createdBy;
        this.modifiedBy = temp.modifiedBy;
        this.status = temp.status;
        this.translateTeam = temp.translateTeam;
        this.roles = temp.roles;
    }

    public AccountEntity(Long accountId, String email, String password, String fullName, LocalDate birthDay, Integer sex, LocalDate createdDate, LocalDate modifiedDate, Long createdBy, Long modifiedBy, Integer status, TranslateTeamEntity translateTeam, Set<RoleEntity> roles) {
        this.accountId = accountId;
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.sex = sex;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
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

    public LocalDate getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDate modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Override
    public String toString() {
        return "AccountEntity{" +
                "accountId=" + accountId +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthDay=" + birthDay +
                ", sex=" + sex +
                ", createdDate=" + createdDate +
                ", modifiedDate=" + modifiedDate +
                ", createdBy='" + createdBy + '\'' +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", status=" + status +
                ", translateTeam=" + translateTeam +
                ", roles=" + roles +
                '}';
    }
}
