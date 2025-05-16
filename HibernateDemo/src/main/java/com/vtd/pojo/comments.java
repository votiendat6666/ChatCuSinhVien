package com.vtd.pojo;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;



@Entity
@Table(name = "comments")
public class comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private posts posts;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private user user;

    private String content;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    // Tao Getter và Setter
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public posts getPosts() {
        return posts;
    }
    public void setPosts(posts posts) {
        this.posts = posts;
    }

    public user getUser() {
        return user;
    }
    public void setUser(user user) {
        this.user = user;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    
}