package com.white.course2homework9.entitys;

import com.white.course2homework9.enums.Department;
import lombok.Data;

import java.util.Objects;


@Data
public class Employee {
    private static long idCount;
    private final long id;
    private String name;
    private String surName;
    private String patronymic;
    private Department department;
    private double salary;

    public Employee(String name, String surName, String patronymic, Department department, double salary) {
        this.name = name;
        this.surName = surName;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        idCount++;
        this.id = idCount;
    }
    @Override
    public String toString() {
        return "id:" + id +
                " имя:" + name +
                " фамилия:" + surName +
                " отчество:" + patronymic +
                " отдел:" + department.getDepartment() +
                " зарплата:" + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(surName, employee.surName) && Objects.equals(patronymic, employee.patronymic) && department == employee.department;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, patronymic, department, salary);
    }
}
