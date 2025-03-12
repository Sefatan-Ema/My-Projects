package com.SpringRestAPI.EmployeeInformation.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emp_pid;
@Column(name="emp_name")
    private String emp_name;
    @Column(name="emp_salary")
    private String emp_salary;
    @Column(name="emp_city")

    private String emp_city;
    @Column(name="emp_phn")
    private String emp_phn;

    public Long getEmp_pid() {
        return emp_pid;
    }
//getter setter
    public void setEmp_pid(Long emp_pid) {
        this.emp_pid = emp_pid;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_salary() {
        return emp_salary;
    }

    public void setEmp_salary(String emp_salary) {
        this.emp_salary = emp_salary;
    }

    public String getEmp_city() {
        return emp_city;
    }

    public void setEmp_city(String emp_city) {
        this.emp_city = emp_city;
    }

    public String getEmp_phn() {
        return emp_phn;
    }

    public void setEmp_phn(String emp_phn) {
        this.emp_phn = emp_phn;
    }
//constructor
    public Employee(Long emp_pid, String emp_name, String emp_salary, String emp_city, String emp_phn) {
        this.emp_pid = emp_pid;
        this.emp_name = emp_name;
        this.emp_salary = emp_salary;
        this.emp_city = emp_city;
        this.emp_phn = emp_phn;
    }

    public Employee(){//constructor without param

    }
//to string to print some value
    @Override
    public String toString() {
        return "Employee{" +
                "emp_pid=" + emp_pid +
                ", emp_name='" + emp_name + '\'' +
                ", emp_salary='" + emp_salary + '\'' +
                ", emp_city='" + emp_city + '\'' +
                ", emp_phn='" + emp_phn + '\'' +
                '}';
    }
}
