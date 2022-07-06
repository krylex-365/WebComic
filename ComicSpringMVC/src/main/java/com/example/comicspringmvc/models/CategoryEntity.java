package com.example.comicspringmvc.models;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "Category")
public class CategoryEntity {

    public CategoryEntity(String categoryName, String description) {
        this.categoryName = categoryName;
        this.description = description;
    }

    public CategoryEntity(CategoryEntity category, Long comicNumber) {
        this.categoryId = category.categoryId;
        this.categoryName = category.categoryName;
        this.description = category.description;
        this.status = category.status;
        this.countComics = comicNumber;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CategoryId")
    private Long categoryId;

    @Column(name = "CategoryName", columnDefinition = "nvarchar", nullable = false)
    private String categoryName;

    @Column(name = "Description")
    private String description;

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

    @Transient
    private Long countComics;

    public CategoryEntity() {

    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Long getCountComics() {
        return countComics;
    }

    public void setCountComics(Long countComics) {
        this.countComics = countComics;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
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
        return "CategoryEntity{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", description='" + description + '\'' +
                ", createdDate=" + createdDate +
                ", modifiedDate=" + modifiedDate +
                ", createdBy='" + createdBy + '\'' +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", status=" + status +
                ", countComics=" + countComics +
                '}';
    }
}