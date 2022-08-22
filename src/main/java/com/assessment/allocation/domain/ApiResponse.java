package com.assessment.allocation.domain;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ApiResponse {
    private HttpStatus status;
    private Object responseBody;
}
