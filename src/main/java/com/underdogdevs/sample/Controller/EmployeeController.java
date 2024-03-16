package com.underdogdevs.sample.Controller;

import com.underdogdevs.sample.Model.DeleteEmployeeResponse;
import com.underdogdevs.sample.Model.EmployeeRequest;
import com.underdogdevs.sample.Model.GetEmployeeResponse;
import com.underdogdevs.sample.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employee")
    public ResponseEntity<EmployeeRequest> addEmployee(@RequestBody @Validated EmployeeRequest employeeRequest){
        return ResponseEntity.ok(employeeService.addEmployee(employeeRequest));
    }

    @DeleteMapping("/employee")
    public ResponseEntity<DeleteEmployeeResponse> deleteEmployee(@RequestBody @Validated EmployeeRequest employeeRequest){
        return ResponseEntity.ok(employeeService.deleteEmployee(employeeRequest));
    }

    @GetMapping("/employee")
    public ResponseEntity<GetEmployeeResponse> getEmployee(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName){
        return ResponseEntity.ok(employeeService.getEmployee(firstName, lastName));
    }
}
