package com.assessment.allocation.assembler;

import com.assessment.allocation.domain.Request;
import com.assessment.allocation.domain.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Assembler {
    public static String generateRange(int min, int max) {
        String resultSet = null;
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(min));
        for (int i = min + 1; i <= max; i++) {
            resultSet = stringBuffer.append(", ").append(i).toString();
            log.info("Incoming request to assembler {} ", resultSet);
        }
        return resultSet;

    }

    public Response assembler(Request request) {
        log.info("Incoming request to assembler {} ", request);
        Response response = new Response();
        response.setAccessCode(request.getAccessCode());
        response.setAreaCode(request.getAreaCode());
        response.setQty(request.getQty());
        response.setMin(request.getMin());
        response.setMax(request.getMax());
        response.setNumberList(generateRange(request.getMin(), request.getMax()));
        return response;
    }
}


