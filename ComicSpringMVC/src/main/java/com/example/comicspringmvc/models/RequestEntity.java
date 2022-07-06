package com.example.comicspringmvc.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Request")
public class RequestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RequestId")
    private Long requestId;

    @Column(name = "Content", columnDefinition = "nvarchar", nullable = false)
    private String content;

    @Column(name = "Date", nullable = false)
    private LocalDate date;

    @Column(name = "Status", columnDefinition = "integer default 2", nullable = false)
    private Integer status = 2;

    @ManyToOne(optional = false)
    @JoinColumn(name = "AccountId", foreignKey = @ForeignKey(name = "FK_Request_Account"))
    private AccountEntity Account;

    public RequestEntity() {
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public AccountEntity getAccount() {
        return Account;
    }

    public void setAccount(AccountEntity account) {
        Account = account;
    }

    @Override
    public String toString() {
        return "RequestEntity{}";
    }
}
