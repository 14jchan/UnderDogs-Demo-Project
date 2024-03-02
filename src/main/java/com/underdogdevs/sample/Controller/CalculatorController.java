package com.underdogdevs.sample.Controller;

import com.underdogdevs.sample.Model.CalculatorRequest;
import com.underdogdevs.sample.Model.CalculatorResponse;
import com.underdogdevs.sample.Model.SampleObject;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    @GetMapping("/helloWorld")
    public String helloWorld(){
        return "Hello World";
    }

    @PostMapping("/addNumbers")
    public ResponseEntity<CalculatorResponse> addNumbers(@RequestBody @Validated CalculatorRequest calculatorRequest){
        Integer result = calculatorRequest.getNumberOne() + calculatorRequest.getNumberTwo();
        if(result < 5){
            throw new RuntimeException();
        }
        CalculatorResponse calculatorResponse = new CalculatorResponse(result);
        return ResponseEntity.ok(calculatorResponse);
    }

    @PostMapping("/test")
    public ResponseEntity<String> test(@RequestBody SampleObject sampleObject){
        return ResponseEntity.status(HttpStatusCode.valueOf(500)).body(sampleObject.getHello());
    }
}
