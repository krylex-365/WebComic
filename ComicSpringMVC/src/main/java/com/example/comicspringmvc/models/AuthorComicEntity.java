package com.example.comicspringmvc.models;
import javax.persistence.*;

@Entity
@Table(name = "AuthorComic")
public class AuthorComicEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AuthorComicId")
    private Long authorComicId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "AuthorId",foreignKey = @ForeignKey(name = "FK_AuthorComic_Author"))
    private AuthorEntity author;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ComicId",foreignKey = @ForeignKey(name = "FK_AuthorComic_Comic"))
    private ComicEntity comic;

    public AuthorComicEntity() {
    }

    public Long getAuthorComicId() {
        return authorComicId;
    }

    public void setAuthorComicId(Long authorComicId) {
        this.authorComicId = authorComicId;
    }

    public AuthorEntity getAuthor() {
        return author;
    }

    public void setAuthor(AuthorEntity author) {
        this.author = author;
    }

    public ComicEntity getComic() {
        return comic;
    }

    public void setComic(ComicEntity comic) {
        this.comic = comic;
    }

    @Override
    public String toString() {
        return "AuthorComicEntity{" +
                "authorComicId=" + authorComicId +
                ", author=" + author +
                ", comic=" + comic +
                '}';
    }
}
