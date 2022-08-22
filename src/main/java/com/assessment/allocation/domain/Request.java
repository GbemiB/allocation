package com.assessment.allocation.domain;

import lombok.Data;

@Data
public class Request {
    private int accessCode;
    private int areaCode;
    private int qty;
    private int min;
    private int max;
}
