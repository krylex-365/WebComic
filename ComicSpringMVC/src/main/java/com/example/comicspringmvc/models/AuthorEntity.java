package com.example.comicspringmvc.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Author")
public class AuthorEntity {
    @Id
    @Column(name = "AuthorID", nullable = false)
    private Long authorId;

    @Column(name = "AuthorName")
    private String authorName;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String name) {
        this.authorName = name;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long id) {
        this.authorId = id;
    }
}