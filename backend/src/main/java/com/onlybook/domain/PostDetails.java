package com.onlybook.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@javax.persistence.Entity
@Table(name = "post_details")
public class PostDetails implements Entity<Long>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "text_content")
    private String textContent;

    @Column(name = "picture_content")
    private String pictureUrl;

    @Override
    public String toString() {
        return "PostDetails{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", textContent='" + textContent + '\'' +
                ", pictureUrl='" + pictureUrl + '\'' +
                '}';
    }

    @Override
    public Long getId() {
        return id;
    }
}
