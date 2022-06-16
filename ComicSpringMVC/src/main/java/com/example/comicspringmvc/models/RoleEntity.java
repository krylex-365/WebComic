package com.example.comicspringmvc.models;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "Role")
public class RoleEntity {
    @Id
    @Column(name = "RoleId", nullable = false)
    private Long roleId;

    @Column(name = "RoleName")
    private String roleName;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        RoleEntity that = (RoleEntity) o;
        return roleId != null && Objects.equals(roleId, that.roleId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}