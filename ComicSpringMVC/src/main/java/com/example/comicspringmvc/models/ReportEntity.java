package com.example.comicspringmvc.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Report")
public class ReportEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ReportId")
    private Long reportId;

    @Column(name = "Content", nullable = false)
    private String content;

    @Column(name = "Date", nullable = false)
    private LocalDate date;

    @Column(name = "Status", columnDefinition = "integer default 2", nullable = false)
    private Integer status = 2;

    @ManyToOne(optional = false)
    @JoinColumn(name = "AccountId", foreignKey = @ForeignKey(name = "FK_Report_Account"))
    private AccountEntity Account;

    public ReportEntity() {
    }

    public Long getReportId() {
        return reportId;
    }

    public void setReportId(Long reportId) {
        this.reportId = reportId;
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
        return "ReportEntity{" +
                "reportId=" + reportId +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", status=" + status +
                ", Account=" + Account +
                '}';
    }
}
