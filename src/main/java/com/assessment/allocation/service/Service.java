package com.assessment.allocation.service;

import com.assessment.allocation.domain.ApiResponse;
import com.assessment.allocation.domain.Request;

public interface Service {
    ApiResponse fetchAllocation(Request request);

}
