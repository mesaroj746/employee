package com.heroku.demo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@Setter
public class EmployeeDTO {

    private BigInteger id;

    private String name;

    private Long phone;
}
