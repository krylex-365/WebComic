package com.example.comicspringmvc.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "TranslateTeam")
public class TranslateTeamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TranslateTeamId")
    private Long translateTeamId;

    @Column(name = "TranslateTeamName", columnDefinition = "nvarchar(100)", nullable = false)
    private String translateTeamName;

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

    public TranslateTeamEntity() {
    }

    public Long getTranslateTeamId() {
        return translateTeamId;
    }

    public void setTranslateTeamId(Long translateTeamId) {
        this.translateTeamId = translateTeamId;
    }

    public String getTranslateTeamName() {
        return translateTeamName;
    }

    public void setTranslateTeamName(String translateTeamName) {
        this.translateTeamName = translateTeamName;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        return "TranslateTeamEntity{" +
                "translateTeamId=" + translateTeamId +
                ", translateTeamName='" + translateTeamName + '\'' +
                ", createdDate=" + createdDate +
                ", modifiedDate=" + modifiedDate +
                ", createdBy='" + createdBy + '\'' +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", status=" + status +
                '}';
    }
}
