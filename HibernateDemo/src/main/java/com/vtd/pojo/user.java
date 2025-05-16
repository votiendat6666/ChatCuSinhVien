package com.vtd.pojo;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
public class user {
    @Id
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "avatar_url")
    private String avatarUrl;

    @Column(name = "cover_image_url")
    private String coverImageUrl;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(name = "is_active")
    private Boolean isActive;

    @Column(name = "last_password_change")
    private LocalDateTime lastPasswordChange;

    // Relationships
    @OneToMany(mappedBy = "user")
    private List<posts> posts;

    @OneToMany(mappedBy = "user")
    private List<comments> comments;

    @OneToMany(mappedBy = "user")
    private List<reactions> reactions;

    @OneToMany(mappedBy = "user")
    private List<survey_responses> surveyResponses;

    @OneToOne(mappedBy = "user")
    private alumni alumni;

    @OneToOne(mappedBy = "user")
    private lecturers lecturer;

    @OneToMany(mappedBy = "user")
    private List<group_members> groupMemberships;

    @OneToMany(mappedBy = "admin")
    private List<notifications> sentNotifications;

    @OneToMany(mappedBy = "user")
    private List<notification_targets> notificationTargets;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getCoverImageUrl() {
        return coverImageUrl;
    }

    public void setCoverImageUrl(String coverImageUrl) {
        this.coverImageUrl = coverImageUrl;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public LocalDateTime getLastPasswordChange() {
        return lastPasswordChange;
    }

    public void setLastPasswordChange(LocalDateTime lastPasswordChange) {
        this.lastPasswordChange = lastPasswordChange;
    }

    public List<posts> getPosts() {
        return posts;
    }

    public void setPosts(List<posts> posts) {
        this.posts = posts;
    }

    public List<comments> getComments() {
        return comments;
    }

    public void setComments(List<comments> comments) {
        this.comments = comments;
    }

    public List<reactions> getReactions() {
        return reactions;
    }

    public void setReactions(List<reactions> reactions) {
        this.reactions = reactions;
    }

    public List<survey_responses> getSurveyResponses() {
        return surveyResponses;
    }

    public void setSurveyResponses(List<survey_responses> surveyResponses) {
        this.surveyResponses = surveyResponses;
    }

    public alumni getAlumni() {
        return alumni;
    }

    public void setAlumni(alumni alumni) {
        this.alumni = alumni;
    }

    public lecturers getLecturer() {
        return lecturer;
    }

    public void setLecturer(lecturers lecturer) {
        this.lecturer = lecturer;
    }

    public List<group_members> getGroupMemberships() {
        return groupMemberships;
    }

    public void setGroupMemberships(List<group_members> groupMemberships) {
        this.groupMemberships = groupMemberships;
    }

    public List<notifications> getSentNotifications() {
        return sentNotifications;
    }

    public void setSentNotifications(List<notifications> sentNotifications) {
        this.sentNotifications = sentNotifications;
    }

    public List<notification_targets> getNotificationTargets() {
        return notificationTargets;
    }

    public void setNotificationTargets(List<notification_targets> notificationTargets) {
        this.notificationTargets = notificationTargets;
    }

    public enum Role {
        USER, ADMIN, MODERATOR
    }
}