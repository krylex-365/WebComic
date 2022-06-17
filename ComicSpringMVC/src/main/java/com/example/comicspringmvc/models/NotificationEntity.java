package com.example.comicspringmvc.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Notification")
public class NotificationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NotificationId")
    private Long notificationId;

    @Column(name = "Date", nullable = false)
    private LocalDate date;

    @Column(name = "Status", columnDefinition = "integer default 2")
    private Integer status = 2;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ComicId",foreignKey = @ForeignKey(name = "FK_Notification_Comic"))
    private ComicEntity comic;

    @ManyToOne(optional = false)
    @JoinColumn(name = "AccountId",foreignKey = @ForeignKey(name = "FK_Notification_Account"))
    private AccountEntity account;

    public NotificationEntity() {
    }

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

    public Long getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(Long notificationId) {
        this.notificationId = notificationId;
    }

    @Override
    public String toString() {
        return "NotificationEntity{" +
                "notificationId=" + notificationId +
                ", date=" + date +
                ", status=" + status +
                ", comic=" + comic +
                ", account=" + account +
                '}';
    }
}