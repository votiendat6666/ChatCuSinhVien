/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vtd.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Admin
 */
    @Entity
@Table(name = "alumni")
public class alumni {
    @Id
    private Long userId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private user user;

    @Column(name = "student_id")
    private String studentId;

    @Column(name = "graduation_year")
    private Integer graduationYear;

    @Column(name = "is_verified")
    private Boolean isVerified;

    
    // Tao Getter và Setter
        public Long getUserId() {
            return userId;
        }
    
        public void setUserId(Long userId) {
            this.userId = userId;
        }
    
        public user getUser() {
            return user;
        }
    
        public void setUser(user user) {
            this.user = user;
        }
    
        public String getStudentId() {
            return studentId;
        }
    
        public void setStudentId(String studentId) {
            this.studentId = studentId;
        }
    
        public Integer getGraduationYear() {
            return graduationYear;
        }
    
        public void setGraduationYear(Integer graduationYear) {
            this.graduationYear = graduationYear;
        }
    
        public Boolean getIsVerified() {
            return isVerified;
        }
    
        public void setIsVerified(Boolean isVerified) {
            this.isVerified = isVerified;
        }
    
}

