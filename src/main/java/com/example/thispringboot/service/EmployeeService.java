package com.example.thispringboot.service;

import com.example.thispringboot.etity.Employee;
import com.example.thispringboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> findAll(){return employeeRepository.findAll();}

    public Optional<Employee> findById(int id){return employeeRepository.findById(id);}

    public void deleteById(int id){employeeRepository.deleteById(id);}
}
