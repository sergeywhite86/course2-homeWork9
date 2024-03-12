package com.white.course2homework9.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployeeAlreadyAdded extends RuntimeException {
    public EmployeeAlreadyAdded() {
        super("Такой сотрудник уже есть");
    }
}
