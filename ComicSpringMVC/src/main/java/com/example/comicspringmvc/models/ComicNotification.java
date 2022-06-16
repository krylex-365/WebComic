package com.example.comicspringmvc.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ComicNotification")
public class ComicNotification {
    @Id
    @Column(name = "notifiation_id", nullable = false)
    private Long notifiationId;

    @Column(name = "Date")
    private LocalDate date;

    @Column(name = "Status")
    private Integer status;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ComicId",foreignKey = @ForeignKey(name = "FK_Notification_Comic"))
    private ComicEntity comic;

    @ManyToOne(optional = false)
    @JoinColumn(name = "AccountId",foreignKey = @ForeignKey(name = "FK_Notification_Account"))
    private AccountEntity account;

    public AccountEntity getAccount() {
        return account;
    }

    public void setAccount(AccountEntity account) {
        this.account = account;
    }

    public ComicEntity getComic() {
        return comic;
    }

    public void setComic(ComicEntity comic) {
        this.comic = comic;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getNotifiationId() {
        return notifiationId;
    }

    public void setNotifiationId(Long notifiationId) {
        this.notifiationId = notifiationId;
    }
}