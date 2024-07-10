package com.IJP_g6.ijp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "JobPosting")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JobPosting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int jobId;

    @Column(name = "Description", nullable = false)
    private String description;

    @Column(name = "Designation", nullable = false)
    private String designation;

    @Column(name = "Location", nullable = false)
    private String location;

    @Column(name = "RequiredSkillSet")
    private String requiredSkillSet;

    @Column(name = "YearsOfExperience")
    private int yearsOfExperience;

    @Column(name = "LanguagesKnown")
    private String languagesKnown;

    @Column(name = "SalaryRange")
    private String salaryRange;

    @Column(name = "PostedBy", nullable = false)
    private String postedBy;

// Getters and setters
}
