package com.assessment.allocation.domain;

import lombok.Data;

@Data
public class Response {
    private int accessCode;
    private int areaCode;
    private int qty;
    private int min;
    private int max;
    private String numberList;
}
