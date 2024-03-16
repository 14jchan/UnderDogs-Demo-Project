package com.underdogdevs.sample.Model;

import com.underdogdevs.sample.Entity.EmployeeEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DeleteEmployeeResponse {
    List<EmployeeEntity> deletedEmployees;
}
