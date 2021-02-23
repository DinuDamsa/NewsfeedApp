package com.onlybook.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@javax.persistence.Entity
@Table(name = "users")
public class User implements Entity<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "username")
    private String username;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "about_you")
    private String aboutYou;

    @Column(name = "profile_image_path")
    private String profileImagePath;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", aboutYou='" + aboutYou + '\'' +
                ", imageUrl='" + profileImagePath + '\'' +
                '}';
    }

    @Override
    public Long getId() {
        return id;
    }
}
