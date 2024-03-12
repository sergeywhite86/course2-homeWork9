package com.white.course2homework9.controllers;


import com.white.course2homework9.entitys.Employee;
import com.white.course2homework9.enums.Department;
import com.white.course2homework9.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@AllArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService service;


    @GetMapping
    List< Employee> findAll() {
        return service.findAll();
    }

    @PostMapping("/add")
    public Employee add(@RequestParam String name, @RequestParam String surName, @RequestParam String patronymic,
                        @RequestParam Department department, @RequestParam double salary) {
        return service.add(name, surName, patronymic, department, salary);
    }

    @DeleteMapping("/remove")
    public void delete(@RequestParam Long id) {
         service.deleteById(id);
    }

    @GetMapping("/find")
    public Employee find(@RequestParam Long id) {
        return service.findById(id);
    }
}
