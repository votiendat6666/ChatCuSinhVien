package com.vtd.pojo;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reactions")
public class reactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private posts post;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private user user;

    @Enumerated(EnumType.STRING)
    private ReactionType type;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public enum ReactionType {
        LIKE, LOVE, HAHA, WOW, SAD, ANGRY
    }
}