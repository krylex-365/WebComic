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

    @Column(name = "TranslateTeamName", nullable = false)
    private String translateTeamName;

    @Column(name = "CreatedDate", nullable = false)
    private LocalDate createdDate;

    @Column(name = "Status", nullable = false)
    private Integer status;

    public TranslateTeamEntity() {
    }

    public TranslateTeamEntity(Long translateTeamId, String translateTeamName, LocalDate createdDate, Integer status) {
        this.translateTeamId = translateTeamId;
        this.translateTeamName = translateTeamName;
        this.createdDate = createdDate;
        this.status = status;
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

    @Override
    public String toString() {
        return "TranslateTeamEntity{" +
                "translateTeamId=" + translateTeamId +
                ", translateTeamName='" + translateTeamName + '\'' +
                ", createdDate=" + createdDate +
                ", status=" + status +
                '}';
    }
}
