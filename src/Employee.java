package com.restapi.task2.load_testonrestapiconcepts;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ToString @Getter @Setter
public class Employee {
    @NotNull(message = "name cannot be null")
    @Size(min = 4  ,message = "name must be more than four characters ")
    private String name;
    @NotNull(message = "emailid cannot be null")
    @Email(message = "not a valid id")
    private String emailid;
    @NotNull(message = "mobile cannot be null")
    private Long mobile;
    public Employee() {
    }
    public Employee(String name, String emailid, Long mobile) {
        this.name = name;
        this.emailid = emailid;
        this.mobile = mobile;
    }
}