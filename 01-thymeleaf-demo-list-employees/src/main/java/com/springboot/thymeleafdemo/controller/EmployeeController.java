package com.springboot.thymeleafdemo.controller;
//mvc-1
import com.springboot.thymeleafdemo.entity.Employee;
import com.springboot.thymeleafdemo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    //controller <---> service <---> repository <---> database
    //define field for employee service
    private EmployeeService employeeService;

    //define constructor to inject dependency injection
    public EmployeeController(EmployeeService theEmployeeService){
        employeeService = theEmployeeService;
    }

    //mapping for "/list"
    @GetMapping("/list")
    public String listEmployees(Model theModel){
        //get employee from db
        List<Employee> theEmployees = employeeService.findAll();

        //add to spring model
        theModel.addAttribute("employees",theEmployees);
        return "list-employees";
    }

}
