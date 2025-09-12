package com.springboot.thymeleafdemo.dao;

import com.springboot.thymeleafdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//step 2: create employee reposity interface and extend JpaRepository<entity type, primarykey>
public interface EmployeeRepository extends JpaRepository<Employee,Integer > {
    // no need to write any code as we are using SpringData JPA

    //mvc-2-4-1
    //add method to list to sort by last name
    public List<Employee> findAllByOrderByLastNameAsc();
}
//step 3: use Repository in our app i.e employeeserviceimpl