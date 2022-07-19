package com.example.comicspringmvc.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;


@Entity
@Table(name = "Category")
public class CategoryEntity {



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

    public CategoryEntity(CategoryEntity category, Long countComics) {
        this.categoryId = category.categoryId;
        this.categoryName = category.categoryName;
        this.description = category.description;
        this.countComics = countComics;
    }

    public CategoryEntity(String categoryName, String description, LocalDate createdDate, Long createBy) {
        this.categoryName = categoryName;
        this.description = description;
        this.createdDate = createdDate;
        this.createdBy = createBy;
        this.status = 1;
    }
    public CategoryEntity(Long categoryId,String categoryName, String description, LocalDate modifiedDate, Long modifiedBy) {
        this.categoryName = categoryName;
        this.description = description;
        this.modifiedDate = modifiedDate;
        this.modifiedBy = modifiedBy;
    }

    public CategoryEntity(String categoryName, String description) {
        this.categoryName = categoryName;
        this.description = description;
        this.status = 1;
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