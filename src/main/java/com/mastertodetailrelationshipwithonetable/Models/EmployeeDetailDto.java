package com.mastertodetailrelationshipwithonetable.Models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmployeeDetailDto {
    private String department;
    private String departmentDescription;
    private String departmentEmployeeCount;
}
