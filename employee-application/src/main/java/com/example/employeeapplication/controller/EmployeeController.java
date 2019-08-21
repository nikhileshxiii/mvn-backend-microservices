package com.example.employeeapplication.controller;

import com.example.employeeapplication.entity.Employee;
import com.example.employeeapplication.repo.EmployeeRepository;

import java.util.Optional;

@RestController
public class EmployeeController {

    private EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable String id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent()) return employee.get();
        else return null;
    }

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }
}
