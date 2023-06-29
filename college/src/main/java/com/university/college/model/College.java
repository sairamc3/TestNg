package com.university.college.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class College {

    private String id;

    private String name;

    private String city;

}
