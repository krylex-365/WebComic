package com.example.comicspringmvc.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Comment")
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CommentId")
    private Long commentId;

    @Column(name = "Content", columnDefinition = "nvarchar", nullable = false)
    private String content;

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
    @JoinColumn(name = "ComicId", foreignKey = @ForeignKey(name = "FK_Comment_Comic"))
    private ComicEntity comic;

    @ManyToOne(optional = false)
    @JoinColumn(name = "AccountId", foreignKey = @ForeignKey(name = "FK_Comment_Account"))
    private AccountEntity Account;

    public CommentEntity() {
    }

    public AccountEntity getAccount() {
        return Account;
    }

    public void setAccount(AccountEntity accountEntity) {
        this.Account = accountEntity;
    }

    public ComicEntity getComic() {
        return comic;
    }

    public void setComic(ComicEntity comic) {
        this.comic = comic;
    }

    public String getComment() {
        return content;
    }

    public void setComment(String content) {
        this.content = content;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long id) {
        this.commentId = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    @Override
    public String toString() {
        return "CommentEntity{" +
                "commentId=" + commentId +
                ", content='" + content + '\'' +
                ", createdDate=" + createdDate +
                ", modifiedDate=" + modifiedDate +
                ", createdBy='" + createdBy + '\'' +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", status=" + status +
                ", comic=" + comic +
                ", Account=" + Account +
                '}';
    }
}