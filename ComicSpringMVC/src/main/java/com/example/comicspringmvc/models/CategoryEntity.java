package com.example.comicspringmvc.models;

import javax.persistence.*;


@Entity
@Table(name = "Category")
public class CategoryEntity {

    public CategoryEntity(String categoryName, String descriptions) {
        this.categoryName = categoryName;
        this.descriptions = descriptions;
    }

    public CategoryEntity(CategoryEntity category, Long comicNumber) {
        this.categoryId = category.categoryId;
        this.categoryName = category.categoryName;
        this.descriptions = category.descriptions;
        this.status = category.status;
        this.comicNumber = comicNumber;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CategoryId")
    private Long categoryId;

    @Column(name = "CategoryName", nullable = false)
    private String categoryName;

    @Column(name = "Descriptions")
    private String descriptions;

    @Column(name = "Status")
    private Integer status = 1;

    @Transient
    private Long comicNumber;

    public CategoryEntity() {

    }

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

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String name) {
        this.categoryName = name;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long id) {
        this.categoryId = id;
    }

    @Override
    public String toString() {
        return "CategoryEntity{}";
    }

    public Long getComicNumber() {
        return comicNumber;
    }

    public void setComicNumber(Long comicNumber) {
        this.comicNumber = comicNumber;
    }
}