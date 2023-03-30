package com.mastertodetailrelationshipwithonetable.Repository;

import com.mastertodetailrelationshipwithonetable.Models.EmployeeModel;
import org.springframework.data.repository.CrudRepository;

public interface Repo extends CrudRepository<EmployeeModel,String> {
}
