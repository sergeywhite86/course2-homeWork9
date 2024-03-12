package com.white.course2homework9.repository;


import com.white.course2homework9.entitys.Employee;
import com.white.course2homework9.enums.Department;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
@RequiredArgsConstructor
@Getter
public class InMemoryDataBase {

    private final List<Employee> data;
    private final int MAXSIZE = 25;

    public InMemoryDataBase() {
        data = new ArrayList<>();
        initDB();
    }
    private void initDB() {
        data.add(new Employee("Светлана", "Солнцева", "Константиновна", Department.MANAGERS, 57000));
        data.add(new Employee("Анна", "Булкина", "Федоровна", Department.MANAGERS, 57000));
        data.add(new Employee("Аркадий", "Продавцов", "Николаевич", Department.MANAGERS, 52000));
        data.add(new Employee("Екатерина", "Певцова", "Ивановна", Department.MANAGERS, 65000));
        data.add(new Employee("Александр", "Купидонов", "Васильевич", Department.SECURITY, 59500));
        data.add(new Employee("Игнат", "Конь", "Николаевич", Department.SECURITY, 61000));
        data.add(new Employee("Иван", "Скала", "Игоревич", Department.SECURITY, 45000));
        data.add(new Employee("Игорь", "Рыбов", "Михайлович", Department.SECURITY, 52500));
        data.add(new Employee("Олег", "Путилов", "Иванович", Department.SECURITY, 53000));
        data.add(new Employee("Инокентий", "Джавов", "Олегович", Department.IT, 70000));
        data.add(new Employee("Ксения", "Плюсова", "Александровна", Department.IT, 150000));
        data.add(new Employee("Мария", "Кошкина", "Сергеевна", Department.IT, 85500));
        data.add(new Employee("Сергей", "Белый", "Сергеевич", Department.IT, 300000));
        data.add(new Employee("Сергей", "Бобылев", "Федорович", Department.ADMINISTRATION, 170000));
        data.add(new Employee("Марина", "Управова", "Ивановна", Department.ADMINISTRATION, 185500));
        data.add(new Employee("Роман", "Иванов", "Иванович", Department.ADMINISTRATION, 150000));
        data.add(new Employee("Лариса", "Поисковна", "Олеговна", Department.HR, 85300));
        data.add(new Employee("Иван", "Гусь", "Константинович", Department.HR, 50000));
        data.add(new Employee("Дмитрий", "Гришенков", "Викторович", Department.HR, 95000));
        data.add(new Employee("Лука", "Святой", "Михайлович", Department.HR, 50000));

    }
}
