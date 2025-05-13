package com.ironhack.spring_lessons.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentInfo {
    private String street;
    private Integer houseNumber;
    private String phone;
}
