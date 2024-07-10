package com.IJP_g6.ijp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseDTO {
    private String statusCode;
    private String message;
}
