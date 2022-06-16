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

    @Column(name = "Content", nullable = false)
    private String content;

    @Column(name = "Date", nullable = false)
    private LocalDate date;

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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
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

    @Override
    public String toString() {
        return "CommentEntity{" +
                "commentId=" + commentId +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", comic=" + comic +
                ", Account=" + Account +
                '}';
    }
}