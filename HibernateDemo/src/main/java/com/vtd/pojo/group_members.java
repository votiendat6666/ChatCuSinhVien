package com.vtd.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "group_members")
public class group_members {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private groups group;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private user user;

    // Tao Getter và Setter
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public groups getGroup() {
        return group;
    }
    public void setGroup(groups group) {
        this.group = group;
    }
    public user getUser() {
        return user;
    }
    public void setUser(user user) {
        this.user = user;
    }
    
}
