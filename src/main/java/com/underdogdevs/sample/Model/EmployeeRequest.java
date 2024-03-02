package com.underdogdevs.sample.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeRequest {
    String FirstName;
    String LastName;
    Date DOB;
}
