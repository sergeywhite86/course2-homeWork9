package com.white.course2homework9.repository;


import com.white.course2homework9.entitys.Employee;
import com.white.course2homework9.exceptions.EmployeeNotFound;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


@Getter
@RequiredArgsConstructor
@Component
public class EmployeeRepositoryImpl implements EmployeeRepository {
    private final InMemoryDataBase dataBase;


    @Override
    public void add(Employee employee) {
        dataBase.getData().add(employee);
    }

    @Override
    public void delete(Employee employee) {
        dataBase.getData().remove(employee);
    }

    @Override
    public Employee findById(Long id) {
        return dataBase.getData().stream()
                .filter(e -> e.getId() == id)
                .toList().stream()
                .findFirst()
                .orElseThrow(EmployeeNotFound::new);
    }

    @Override
    public List<Employee> findAll() {
        return dataBase.getData();
    }

    @Override
    public boolean contains(Employee employee) {
        return dataBase.getData().contains(employee);
    }

    @Override
    public boolean isNotFullDb() {
        return dataBase.getMAXSIZE() >= dataBase.getData().size();
    }
}
