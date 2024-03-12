package com.white.course2homework9.service;

import com.white.course2homework9.entitys.Employee;
import com.white.course2homework9.enums.Department;
import com.white.course2homework9.exceptions.EmployeeNotFound;
import com.white.course2homework9.repository.EmployeeRepositoryImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.groupingBy;


@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private final EmployeeRepositoryImpl repository;


    @Override
    public Employee empWithMaxSalaryByDepartment(int departmentNumber) {
        Department department = getDepartmentByNumber(departmentNumber);
        return repository.findAll().stream()
                .filter(e -> e.getDepartment().equals(department))
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElseThrow(EmployeeNotFound::new);
    }

    @Override
    public Employee empWithMinSalaryByDepartment(int departmentNumber) {
        Department department = getDepartmentByNumber(departmentNumber);
        return repository.findAll().stream()
                .filter(e -> e.getDepartment().equals(department))
                .min(Comparator.comparingDouble(Employee::getSalary))
                .orElseThrow(EmployeeNotFound::new);
    }

    @Override
    public List<Employee> findAllByDepartment(int departmentNumber) {
        Department department = getDepartmentByNumber(departmentNumber);
        return repository.findAll().stream()
                .filter(e -> e.getDepartment().equals(department))
                .toList();

    }

    @Override
    public Map<Department, List<Employee>> findEmployeesByDepartment() {
        return repository.findAll().stream()
                .collect(groupingBy(Employee::getDepartment));
    }

    private Department getDepartmentByNumber(int departmentNumber) {
        int sizeArrDepartments = Department.values().length;
        if (departmentNumber >= sizeArrDepartments) throw new EmployeeNotFound();
        return Department.values()[departmentNumber];
    }
}

