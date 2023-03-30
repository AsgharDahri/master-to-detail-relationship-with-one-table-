package com.mastertodetailrelationshipwithonetable.Controllers;

import com.mastertodetailrelationshipwithonetable.Models.EmployeeModel;
import com.mastertodetailrelationshipwithonetable.Models.EmpoloyeeDTO;
import com.mastertodetailrelationshipwithonetable.Repository.Repo;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class EmployeeController {
    @Autowired
    private Repo repo;
    @PostMapping("/save")
    public EmployeeModel save(@RequestBody EmpoloyeeDTO employeeDto){
        EmployeeModel employeeModel =new EmployeeModel();
        employeeModel.setEmpName(employeeDto.getEmpName());
        employeeModel.setEmpDesignation(employeeDto.getEmpDesignation());
        employeeModel.setEmployeeDetailTable(new JSONObject(employeeDto.getEmployeeDetailDto()).toString());
        return repo.save(employeeModel);
    }


}
