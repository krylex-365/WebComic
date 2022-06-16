package com.example.comicspringmvc.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Categories")
public class CategoriesEntity {
    @Id
    @Column(name = "CateId", nullable = false)
    private Long cateId;

    @Column(name = "CateName")
    private String cateName;

    @Column(name = "Descriptions")
    private String descriptions;

    @Column(name = "Status")
    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String name) {
        this.cateName = name;
    }

    public Long getCateId() {
        return cateId;
    }

    public void setCateId(Long id) {
        this.cateId = id;
    }
}