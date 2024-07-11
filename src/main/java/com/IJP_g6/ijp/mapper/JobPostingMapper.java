package com.IJP_g6.ijp.mapper;

import com.IJP_g6.ijp.dto.JobPostingDTO;
import com.IJP_g6.ijp.entity.JobPosting;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class JobPostingMapper {
    public static JobPostingDTO mapToJobPostingDTO(JobPostingDTO jobPostingDTO, JobPosting jobPosting){
        jobPostingDTO.setJobId(jobPosting.getJobId());
        jobPostingDTO.setDescription(jobPosting.getDescription());
        jobPostingDTO.setDesignation(jobPosting.getDesignation());
        jobPostingDTO.setLocation(jobPosting.getLocation());
        jobPostingDTO.setRequiredSkillSet(jobPosting.getRequiredSkillSet());
        jobPostingDTO.setYearsOfExperience(jobPosting.getYearsOfExperience());
        jobPostingDTO.setLanguagesKnown(jobPostingDTO.getLanguagesKnown());
        jobPostingDTO.setSalaryRange(jobPosting.getSalaryRange());
        jobPostingDTO.setPostedBy(jobPosting.getPostedBy());
        return jobPostingDTO;
    }

    public static JobPosting mapToJobPosting(JobPostingDTO jobPostingDTO, JobPosting jobPosting){
        //jobPosting.setJobId(jobPostingDTO.getJobId());
        jobPosting.setDescription(jobPostingDTO.getDescription());
        jobPosting.setDesignation(jobPostingDTO.getDesignation());
        jobPosting.setLocation(jobPostingDTO.getLocation());
        jobPosting.setRequiredSkillSet(jobPostingDTO.getRequiredSkillSet());
        jobPosting.setYearsOfExperience(jobPostingDTO.getYearsOfExperience());
        jobPosting.setLanguagesKnown(jobPostingDTO.getLanguagesKnown());
        jobPosting.setSalaryRange(jobPostingDTO.getSalaryRange());
        jobPosting.setPostedBy(jobPostingDTO.getPostedBy());
        return jobPosting;
    }
}
