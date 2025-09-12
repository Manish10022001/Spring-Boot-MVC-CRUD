package com.springboot.thymeleafdemo.service;
//step :5
import com.springboot.thymeleafdemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    //Step 9: add methods
    Employee findById(int theId);
    Employee save(Employee theEmployee);
    void deleteById(int theId);
}
