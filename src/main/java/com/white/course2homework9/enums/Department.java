package com.white.course2homework9.enums;

import lombok.Getter;

@Getter
public enum Department {
    IT("IT"),
    MANAGERS("продажи"),
    HR("HR"),
    SECURITY("безопасность"),
    ADMINISTRATION("управление");

    private final String department;

    Department(String department) {
        this.department = department;
    }

}
