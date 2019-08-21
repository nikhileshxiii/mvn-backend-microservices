package com.example.employeeapplication.seeder;

import com.example.employeeapplication.entity.Employee;
import com.example.employeeapplication.repo.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBSeeder implements CommandLineRunner {

    private EmployeeRepository employeeRepository;

    public DBSeeder(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        employeeRepository.save(new Employee("1", "empone", "USA", "empone@gmail.com"));
        employeeRepository.save(new Employee("2", "emptwo", "USA", "emptwo@gmail.com"));
        employeeRepository.save(new Employee("3", "empthree", "USA", "empthree@gmail.com"));
        employeeRepository.save(new Employee("4", "empfour", "USA", "empfour@gmail.com"));
        employeeRepository.save(new Employee("5", "empfive", "USA", "empfive@gmail.com"));
        employeeRepository.save(new Employee("6", "empsix", "USA", "empsix@gmail.com"));
        employeeRepository.save(new Employee("7", "empseven", "USA", "empseven@gmail.com"));
    }
}
