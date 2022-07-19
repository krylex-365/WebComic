package com.example.comicspringmvc.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Comic")
public class ComicEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ComicId")
    private Long comicId;

    public ComicEntity(String comicName, String description) {
        this.comicName = comicName;
        this.description = description;
    }

    @Column(name = "ComicName", columnDefinition = "nvarchar", nullable = false)
    private String comicName;

    @Column(name = "ComicThumbnail", nullable = false)
    private String comicThumbnail;

    @Column(name = "Description", columnDefinition = "text", nullable = false)
    private String description;

    @Column(name = "DateFrom")
    private LocalDate dateFrom;

    @Column(name = "DateTo")
    private LocalDate dateTo;

    @Column(name = "Likes", columnDefinition = "integer default 0")
    private Integer likes;

    @Column(name = "Dislikes", columnDefinition = "integer default 0")
    private Integer dislikes;

    @Column(name = "Views", columnDefinition = "integer default 0")
    private Integer views;

    @Column(name = "Follows", columnDefinition = "integer default 0")
    private Integer follows;

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

    @ManyToOne(optional = false)
    @JoinColumn(name = "TranslatedBy", nullable = false, foreignKey = @ForeignKey(name = "FK_Comic_TranslateTeam"))
    private TranslateTeamEntity translatedBy;

    @Transient
    private Long countChapters;

    public ComicEntity() {
    }

    public Long getComicId() {
        return comicId;
    }

    public void setComicId(Long comicId) {
        this.comicId = comicId;
    }

    public String getComicName() {
        return comicName;
    }

    public void setComicName(String comicName) {
        this.comicName = comicName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public Integer getLike() {
        return likes;
    }

    public void setLike(Integer likes) {
        this.likes = likes;
    }

    public Integer getDislikes() {
        return dislikes;
    }

    public void setDislikes(Integer dislikes) {
        this.dislikes = dislikes;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getFollows() {
        return follows;
    }

    public void setFollows(Integer follows) {
        this.follows = follows;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getComicThumbnail() {
        return comicThumbnail;
    }

    public void setComicThumbnail(String comicThumbnail) {
        this.comicThumbnail = comicThumbnail;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public TranslateTeamEntity getTranslatedBy() {
        return translatedBy;
    }

    public void setTranslatedBy(TranslateTeamEntity translatedBy) {
        this.translatedBy = translatedBy;
    }

    public Long getCountChapters() {
        return countChapters;
    }

    public void setCountChapters(Long countChapters) {
        this.countChapters = countChapters;
    }

    @Override
    public String toString() {
        return "ComicEntity{" +
                "comicId=" + comicId +
                ", comicName='" + comicName + '\'' +
                ", comicThumbnail='" + comicThumbnail + '\'' +
                ", description='" + description + '\'' +
                ", dateFrom=" + dateFrom +
                ", dateTo=" + dateTo +
                ", likes=" + likes +
                ", dislikes=" + dislikes +
                ", views=" + views +
                ", follows=" + follows +
                ", createdBy=" + createdBy +
                ", createdDate=" + createdDate +
                ", modifiedBy=" + modifiedBy +
                ", modifiedDate=" + modifiedDate +
                ", status=" + status +
                ", countChapters=" + countChapters +
                '}';
    }
}