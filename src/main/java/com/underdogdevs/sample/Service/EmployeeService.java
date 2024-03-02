package com.underdogdevs.sample.Service;

import com.underdogdevs.sample.Entity.EmployeeEntity;
import com.underdogdevs.sample.Model.CalculatorRequest;
import com.underdogdevs.sample.Model.EmployeeRequest;
import com.underdogdevs.sample.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public EmployeeRequest addEmployee(EmployeeRequest employeeRequest){
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setFirstName(employeeRequest.getFirstName());
        employeeEntity.setLastName(employeeRequest.getLastName());
        employeeEntity.setDob(employeeEntity.getDob());

        employeeRepository.save(employeeEntity);
        return employeeRequest;
    }
}
