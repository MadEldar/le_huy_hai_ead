package com.example.le_huy_hai_ead.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "candidate")
public class CandidateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "jobs")
    private String jobs;

    @Column(name = "skills")
    private String skills;

    @Column(name = "dob")
    private Date dob;

    public CandidateEntity() {
    }

    public CandidateEntity(String name, String address, String phone, Date dob, String jobs, String skills) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.jobs = jobs;
        this.skills = skills;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
