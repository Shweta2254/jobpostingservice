package com.IJP_g6.ijp.controller;

import com.IJP_g6.ijp.dto.JobPostingDTO;
import com.IJP_g6.ijp.dto.ResponseDTO;
import com.IJP_g6.ijp.entity.JobPosting;
import com.IJP_g6.ijp.service.IJobPostingService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/api/jobposting")
@AllArgsConstructor
public class JobPostingController {

    private final IJobPostingService iJobPostingService;

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createAccount(@Valid @RequestBody JobPostingDTO jobPostingDTO) {
       iJobPostingService.createJob(jobPostingDTO);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDTO("201", "Created Successfully"));
    }


    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.status(HttpStatus.OK).body("Hello World");
    }
}
