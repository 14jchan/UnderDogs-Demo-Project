package com.underdogdevs.sample.Controller;

import com.underdogdevs.sample.Model.CalculatorRequest;
import com.underdogdevs.sample.Model.CalculatorResponse;
import com.underdogdevs.sample.Model.EmployeeRequest;
import com.underdogdevs.sample.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employee")
    public ResponseEntity<EmployeeRequest> addNumbers(@RequestBody @Validated EmployeeRequest employeeRequest){
        return ResponseEntity.ok(employeeService.addEmployee(employeeRequest));
    }
}
