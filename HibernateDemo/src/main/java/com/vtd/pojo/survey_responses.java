package com.vtd.pojo;



import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "survey_responses")
public class survey_responses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Nếu option_id là self-reference, giữ nguyên, nếu không thì sửa lại entity phù hợp
    @ManyToOne
    @JoinColumn(name = "option_id")
    private survey_responses option;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private user user;

    @Column(name = "created_at")
    private LocalDateTime createdAt;



    // Tao Getter và Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public survey_responses getOption() {
        return option;
    }

    public void setOption(survey_responses option) {
        this.option = option;
    }

    public user getUser() {
        return user;
    }

    public void setUser(user user) {
        this.user = user;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

}