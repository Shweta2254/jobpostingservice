package com.IJP_g6.ijp.controller;

import com.IJP_g6.ijp.dto.JobPostingDTO;
import com.IJP_g6.ijp.dto.ResponseDTO;
import com.IJP_g6.ijp.service.IJobPostingService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/fetch")
    public ResponseEntity<JobPostingDTO> fetchJobPostingDetails(@RequestParam int id) {
        JobPostingDTO jobPostingDTO = iJobPostingService.fetchJobPostingDetails(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(jobPostingDTO);
    }

    @GetMapping("/fetchAll")
    public ResponseEntity<List<JobPostingDTO>> fetchAllJobPosting(){
        List<JobPostingDTO> employeeDTO = iJobPostingService.fetchAllJobPosting();
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(employeeDTO);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateAccount(@RequestParam int id ,@RequestBody JobPostingDTO jobPostingDTO) {
        boolean isUpdated = iJobPostingService.updateJobPosting( id,jobPostingDTO);

        if (isUpdated) {
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseDTO("204", "Updated successfully"));
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ResponseDTO("500", "Internal Server Error"));
        }

    }

    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.status(HttpStatus.OK).body("Hello World");
    }
}
