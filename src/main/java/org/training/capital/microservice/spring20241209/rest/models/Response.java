package org.training.capital.microservice.spring20241209.rest.models;

import lombok.Data;

@Data
public class Response<T> {
    private boolean errorOccurred;
    private String errorDesc;
    private Integer errorCode;
    private T data;
}
