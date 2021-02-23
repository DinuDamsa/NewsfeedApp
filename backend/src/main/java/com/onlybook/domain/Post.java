package com.onlybook.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@javax.persistence.Entity
@Table(name = "posts")
public class Post implements Entity<Long>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @OneToOne()
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    private PostDetails postDetails;

    @OneToOne()
    private Category category;

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", user=" + user +
                ", postDetails=" + postDetails +
                ", categories=" + category +
                '}';
    }

    @Override
    public Long getId() {
        return id;
    }
}
