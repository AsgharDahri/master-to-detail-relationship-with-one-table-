package com.mastertodetailrelationshipwithonetable.Models;

import lombok.Getter;
import lombok.Setter;
import org.json.JSONObject;

@Getter
@Setter
public class EmpoloyeeDTO {
    private int empId;
    private String empName;
    private String empDesignation;

    private EmployeeDetailDto employeeDetailDto;
}
