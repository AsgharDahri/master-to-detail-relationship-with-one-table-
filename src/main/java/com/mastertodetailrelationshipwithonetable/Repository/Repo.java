package com.mastertodetailrelationshipwithonetable.Repository;

import com.mastertodetailrelationshipwithonetable.Models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface Repo extends CrudRepository<Employee,String> {
}
