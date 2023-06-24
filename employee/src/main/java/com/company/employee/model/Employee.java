package com.company.employee.model;

import lombok.*;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Employee {

    private int id;
    private String name;
    private String designation;
    private String status;
}
