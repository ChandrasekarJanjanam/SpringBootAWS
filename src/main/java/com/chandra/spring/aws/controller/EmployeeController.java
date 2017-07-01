package com.chandra.spring.aws.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chandra.spring.aws.model.Employee;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
	
	 @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Employee> getEmployees() 
    {
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1,"don","bosco","@gmail.com"));
		return employeesList;
    }

}
