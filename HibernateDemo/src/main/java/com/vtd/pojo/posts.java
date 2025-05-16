package com.vtd.pojo;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "posts")
public class posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private user user;

    private String content;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "can_comment")
    private Boolean canComment;

    @Column(name = "is_survey")
    private Boolean isSurvey;

    @OneToMany(mappedBy = "post")
    private List<comments> comments;

    @OneToMany(mappedBy = "post")
    private List<reactions> reactions;

    @OneToMany(mappedBy = "post")
    private List<survey_options> surveyOptions;
}
