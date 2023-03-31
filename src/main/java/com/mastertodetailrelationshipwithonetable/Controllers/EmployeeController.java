package com.mastertodetailrelationshipwithonetable.Controllers;

import com.mastertodetailrelationshipwithonetable.Models.Employee;
import com.mastertodetailrelationshipwithonetable.Repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class EmployeeController {
    @Autowired
    private Repo repo;
    @PostMapping("/save")
    public Employee save(@RequestBody Employee employee){
        return repo.save(employee);
    }


}
