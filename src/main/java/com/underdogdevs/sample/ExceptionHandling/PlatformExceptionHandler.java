package com.underdogdevs.sample.ExceptionHandling;

import com.underdogdevs.sample.Model.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.concurrent.ExecutionException;

@RestControllerAdvice
public class PlatformExceptionHandler {

    @ExceptionHandler({
            HttpMessageNotReadableException.class
    })
    public ResponseEntity<ErrorResponse> invalidRequestHandler(){
        ErrorResponse errorResponse = ErrorResponse.builder().description("Your Response is not valid").build();
        return ResponseEntity.status(400).body(errorResponse);
    }

    @ExceptionHandler({
        RuntimeException.class
    })
    public ResponseEntity<ErrorResponse> serviceExceptionHandler(Exception e){
        e.printStackTrace();
        ErrorResponse errorResponse = ErrorResponse.builder().description("number cannot be less than 5").build();
        return ResponseEntity.status(403).body(errorResponse);
    }

}
