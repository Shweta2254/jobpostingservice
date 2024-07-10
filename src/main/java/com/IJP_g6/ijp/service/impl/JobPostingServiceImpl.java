package com.IJP_g6.ijp.service.impl;

import com.IJP_g6.ijp.dto.JobPostingDTO;
import com.IJP_g6.ijp.entity.JobPosting;
import com.IJP_g6.ijp.service.IJobPostingService;
import lombok.AllArgsConstructor;
import com.IJP_g6.ijp.mapper.JobPostingMapper;
import org.springframework.stereotype.Service;
import com.IJP_g6.ijp.repository.JobPostingRepository;

import java.util.Optional;

@Service
@AllArgsConstructor
public class JobPostingServiceImpl implements IJobPostingService {
    private JobPostingRepository jobPostingRepository;
   

    @Override
    public void createJob(JobPostingDTO jobPostingDTO) {
        Optional<JobPosting> foundJob = jobPostingRepository.findById(jobPostingDTO.getJobId());

        if (foundJob.isPresent()) {
            System.out.println("Job already exists");
            return;
        }
        JobPosting jobPosting = JobPostingMapper.mapToJobPosting(jobPostingDTO, new JobPosting());
//        customer.setCreatedAt(LocalDateTime.now());
//        customer.setCreatedBy("Anonymous");
        jobPostingRepository.save(jobPosting);


    }

}
