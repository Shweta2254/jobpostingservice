package com.IJP_g6.ijp.service.impl;

import com.IJP_g6.ijp.dto.JobPostingDTO;
import com.IJP_g6.ijp.entity.JobPosting;
import com.IJP_g6.ijp.exception.ResourceNotFoundException;
import com.IJP_g6.ijp.service.IJobPostingService;
import lombok.AllArgsConstructor;
import com.IJP_g6.ijp.mapper.JobPostingMapper;
import org.springframework.stereotype.Service;
import com.IJP_g6.ijp.repository.JobPostingRepository;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
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

    @Override
    public JobPostingDTO fetchJobPostingDetails(int id) {
        JobPosting foundJobPosting = jobPostingRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("JobPosting", "JobId", id)
                //System.out.println("not found");
        );


        //customerDto.setJobPostingDTO(accountsDto);
        return JobPostingMapper.mapToJobPostingDTO(new JobPostingDTO(), foundJobPosting);
    }

    @Override
    public List<JobPostingDTO> fetchAllJobPosting(){
        List<JobPosting> employees = jobPostingRepository.findAll();
        List<JobPostingDTO> employeeDTO = new ArrayList<>();
        for(JobPosting emp : employees){
            employeeDTO.add(JobPostingMapper.mapToJobPostingDTO(new JobPostingDTO(),emp));
        }
        return employeeDTO;
    }

    @Override
    public boolean updateJobPosting(int id, JobPostingDTO jobPostingDTO) {
        boolean isUpdated = false;
        JobPosting jobPosting = jobPostingRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("JobPosting", "JobId", id)
        );

        if (jobPosting != null) {

            JobPosting updatedJobPosting = JobPostingMapper.mapToJobPosting(jobPostingDTO, jobPosting);
            jobPostingRepository.save(updatedJobPosting);
            isUpdated = true;
        }
        return isUpdated;
    }

    public boolean deleteJobPosting(int jobId) {
        boolean isDeleted = false;

        JobPosting jobPosting = jobPostingRepository.findById(jobId).orElseThrow(
                () -> new ResourceNotFoundException("jobPosting", "jobId",jobId)
        );

        if (jobPosting != null) {
            jobPostingRepository.deleteByJobId(jobPosting.getJobId());
            isDeleted = true;
        }
        return isDeleted;
    }


}
