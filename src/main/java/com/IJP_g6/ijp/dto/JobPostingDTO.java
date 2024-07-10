package com.IJP_g6.ijp.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JobPostingDTO {
    private int jobId;
    private String description;
    private String designation;
    private String location;
    private String requiredSkillSet;
    private int yearsOfExperience;
    private String languagesKnown;
    private String salaryRange;
    private String postedBy;

}
