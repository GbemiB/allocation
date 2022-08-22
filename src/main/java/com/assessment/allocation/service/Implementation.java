package com.assessment.allocation.service;

import com.assessment.allocation.assembler.Assembler;
import com.assessment.allocation.domain.ApiResponse;
import com.assessment.allocation.domain.Request;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;

@Slf4j
@org.springframework.stereotype.Service

public class Implementation implements Service {
    private final Assembler assembler;

    public Implementation(Assembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public ApiResponse fetchAllocation(Request request) {
        ApiResponse apiResponse = new ApiResponse();
        log.info("Incoming request to service {} ", request);
        if (request.getMin() > request.getMax() || request.getMin() == request.getMax()){
            apiResponse.setStatus(HttpStatus.BAD_REQUEST);
            apiResponse.setResponseBody("Minimum number is greater than max number");
            return apiResponse;
        } else {
            apiResponse.setStatus(HttpStatus.OK);
            apiResponse.setResponseBody(assembler.assembler(request));
            return apiResponse;
        }
    }
}
