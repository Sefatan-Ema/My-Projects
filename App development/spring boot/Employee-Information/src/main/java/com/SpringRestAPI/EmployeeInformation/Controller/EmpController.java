package com.SpringRestAPI.EmployeeInformation.Controller;

import com.SpringRestAPI.EmployeeInformation.Entity.Employee;
import com.SpringRestAPI.EmployeeInformation.Repositoy.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpController {


    @Autowired
    EmpRepository empRepository;


    @PostMapping("/emp")
    public String createmployee(@RequestBody Employee employee){
        empRepository.save(employee);
return "ema";

    }
@GetMapping("/emp")
    public ResponseEntity<List<Employee>> getallEmployee(){
        List<Employee> empList =new ArrayList<>();
    empRepository.findAll().forEach(empList::add);
    return new ResponseEntity<List<Employee>>(empList, HttpStatus.OK);
}

}
//    @PostMapping("/emp2")//json formate rqst pyload=employee
//    public void save(@RequestBody Employee employee) {//payload=employee
//
//        System.out.println(employee);
//    }
//    }
