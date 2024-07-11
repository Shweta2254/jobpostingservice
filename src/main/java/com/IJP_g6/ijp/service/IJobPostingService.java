package com.IJP_g6.ijp.service;

import com.IJP_g6.ijp.dto.JobPostingDTO;
import com.IJP_g6.ijp.entity.JobPosting;

import java.util.List;

public interface IJobPostingService {
    void createJob(JobPostingDTO jobPostingDTO);

     JobPostingDTO fetchJobPostingDetails(int Id);

//
    boolean updateJobPosting( int JobId, JobPostingDTO jobPostingDTO);

    List<JobPostingDTO> fetchAllJobPosting();
//
//    boolean deleteAccount(String mobileNumber);
//
//    List<CustomerDto> fetchAllCustomers();
}
