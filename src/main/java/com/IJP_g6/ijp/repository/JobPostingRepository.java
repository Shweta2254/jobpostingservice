package com.IJP_g6.ijp.repository;

import com.IJP_g6.ijp.entity.JobPosting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository

public interface JobPostingRepository extends JpaRepository<JobPosting, Integer> {
    @Modifying
    @Transactional
    void deleteByJobId(int jobId);
    //Optional<JobPosting> findByMobileNumber(String mobileNumber);
}
