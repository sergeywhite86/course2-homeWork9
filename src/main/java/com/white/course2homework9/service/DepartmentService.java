package com.white.course2homework9.service;

import com.white.course2homework9.entitys.Employee;
import com.white.course2homework9.enums.Department;

import java.util.List;
import java.util.Map;

public interface DepartmentService {
    Employee EmpWithMaxSalaryByDepartment(int departmentNumber);

    Employee EmpWithMinSalaryByDepartment(int departmentNumber);

    List<Employee> findAllByDepartment(int departmentNumber);

    Map<Department, List<Employee>> findEmployeesByDepartment();
}

