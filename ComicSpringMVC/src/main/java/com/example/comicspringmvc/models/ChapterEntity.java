package com.example.comicspringmvc.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Chapter")
public class ChapterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ChapterId")
    private Long chapterId;

    @Column(name = "ChapterName", nullable = false)
    private String chapterName;

    @Column(name = "CreatedDate", nullable = false)
    private LocalDate createdDate;

    @Column(name = "ModifiedDate")
    private LocalDate modifiedDate;

    @ManyToOne(optional = false)
    @JoinColumn(name = "CreatedBy", nullable = false, foreignKey = @ForeignKey(name = "FK_Chapter_AccountCreated"))
    private AccountEntity createdBy;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ModifiedBy", foreignKey = @ForeignKey(name = "FK_Chapter_AccountModified"))
    private AccountEntity modifiedBy;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ComicId", nullable = false, foreignKey = @ForeignKey(name = "FK_Chapter_Comic"))
    private ComicEntity comic;

    public ChapterEntity() {
    }

    public Long getChapterId() {
        return chapterId;
    }

    public void setChapterId(Long chapterId) {
        this.chapterId = chapterId;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
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

    public AccountEntity getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(AccountEntity createdBy) {
        this.createdBy = createdBy;
    }

    public AccountEntity getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(AccountEntity modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public ComicEntity getComic() {
        return comic;
    }

    public void setComic(ComicEntity comic) {
        this.comic = comic;
    }

    @Override
    public String toString() {
        return "ChapterEntity{" +
                "chapterId=" + chapterId +
                ", chapterName='" + chapterName + '\'' +
                ", createdDate=" + createdDate +
                ", modifiedDate=" + modifiedDate +
                ", createdBy=" + createdBy +
                ", modifiedBy=" + modifiedBy +
                ", comic=" + comic +
                '}';
    }
}