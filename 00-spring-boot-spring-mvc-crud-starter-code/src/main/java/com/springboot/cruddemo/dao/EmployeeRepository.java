package com.springboot.cruddemo.dao;

import com.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//step 2: create employee reposity interface and extend JpaRepository<entity type, primarykey>
public interface EmployeeRepository extends JpaRepository<Employee,Integer > {
    // no need to write any code as we are using SpringData JPA
}
//step 3: use Repository in our app i.e employeeserviceimpl