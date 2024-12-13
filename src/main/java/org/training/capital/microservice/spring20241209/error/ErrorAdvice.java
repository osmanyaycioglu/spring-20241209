package org.training.capital.microservice.spring20241209.error;

import jakarta.validation.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.stream.Collectors;

@RestControllerAdvice
public class ErrorAdvice {

    private static final Logger logger = LoggerFactory.getLogger(ErrorAdvice.class);

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorObj handle(IllegalArgumentException exp) {
        return ErrorObj.builder()
                       .withErrorDescParam(exp.getMessage())
                       .withErrorCodeParam(ERestError.FIELD_VALIDATION_ERROR.getErrorCode())
                       .build();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorObj handle(MethodArgumentNotValidException exp) {
        return ErrorObj.builder()
                       .withErrorDescParam("ValidationError")
                       .withErrorCodeParam(ERestError.FIELD_VALIDATION_ERROR.getErrorCode())
                       .withSubErrorsParam(exp.getAllErrors()
                                              .stream()
                                              .map(e -> ErrorObj.builder()
                                                                .withErrorDescParam(e.toString())
                                                                .withErrorCodeParam(1025)
                                                                .build())
                                              .collect(Collectors.toList()))
                       .build();
    }

    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorObj handle(ConstraintViolationException exp) {
        return ErrorObj.builder()
                       .withErrorDescParam("ValidationError")
                       .withErrorCodeParam(ERestError.FIELD_VALIDATION_ERROR.getErrorCode())
                       .withSubErrorsParam(exp.getConstraintViolations()
                                              .stream()
                                              .map(e -> ErrorObj.builder()
                                                                .withErrorDescParam(e.toString())
                                                                .withErrorCodeParam(1025)
                                                                .build())
                                              .collect(Collectors.toList()))
                       .build();
    }


    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorObj handle(Exception exp) {
        logger.error("[ErrorAdvice][handle]-> *Error* : " + exp.getMessage(),
                     exp);
        return ErrorObj.builder()
                       .withErrorDescParam(exp.getMessage())
                       .withErrorCodeParam(ERestError.INTERNAL_ERROR.getErrorCode())
                       .build();
    }

}
