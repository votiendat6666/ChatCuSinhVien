package com.vtd.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;



@Entity
@Table(name = "survey_options")
public class survey_options {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private posts post;

    @Column(name = "option_text")
    private String optionText;

    @OneToMany(mappedBy = "option")
    private List<survey_options> responses;
}