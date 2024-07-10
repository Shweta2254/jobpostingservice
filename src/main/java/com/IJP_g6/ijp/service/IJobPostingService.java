package com.IJP_g6.ijp.service;

import com.IJP_g6.ijp.dto.JobPostingDTO;
import com.IJP_g6.ijp.entity.JobPosting;

public interface IJobPostingService {
    void createJob(JobPostingDTO jobPostingDTO);

//    CustomerDto fetchAccountDetails(String mobileNumber);
//
//    boolean updateAccount(String mobileNumber, CustomerDto customerDto);
//
//    boolean deleteAccount(String mobileNumber);
//
//    List<CustomerDto> fetchAllCustomers();
}
