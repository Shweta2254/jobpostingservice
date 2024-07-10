package com.IJP_g6.ijp.repository;

import com.IJP_g6.ijp.entity.JobPosting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface JobPostingRepository extends JpaRepository<JobPosting, Integer> {

    //Optional<JobPosting> findByMobileNumber(String mobileNumber);
}
