package com.SpringRestAPI.EmployeeInformation.Repositoy;

import com.SpringRestAPI.EmployeeInformation.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//Always interface
public interface EmpRepository extends JpaRepository<Employee,Long> {
}
