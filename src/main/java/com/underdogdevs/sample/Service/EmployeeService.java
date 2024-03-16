package com.underdogdevs.sample.Service;

import com.underdogdevs.sample.Entity.EmployeeEntity;
import com.underdogdevs.sample.Model.CalculatorRequest;
import com.underdogdevs.sample.Model.DeleteEmployeeResponse;
import com.underdogdevs.sample.Model.EmployeeRequest;
import com.underdogdevs.sample.Model.GetEmployeeResponse;
import com.underdogdevs.sample.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Transactional
    public DeleteEmployeeResponse deleteEmployee(EmployeeRequest employeeRequest){
        String firstName = employeeRequest.getFirstName();
        String lastName = employeeRequest.getLastName();
        List<EmployeeEntity> deletedEmployees = employeeRepository.deleteAllByFirstNameIgnoreCaseAndLastNameIgnoreCaseOrderByID(firstName, lastName);
        DeleteEmployeeResponse deleteEmployeeResponse = new DeleteEmployeeResponse(deletedEmployees);
        return deleteEmployeeResponse;
    }

    public GetEmployeeResponse getEmployee(String firstName, String lastName){
        List<EmployeeEntity> matchingEmployees = employeeRepository.findByFirstNameIgnoreCaseAndLastNameIgnoreCaseOrderByID(firstName, lastName);
        GetEmployeeResponse getEmployeeResponse = new GetEmployeeResponse(matchingEmployees);
        return getEmployeeResponse;
    }
}
