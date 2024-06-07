package com.app.controller.dto;

import com.app.advice.validation.anotation.ValidName;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    //@NotNull
    @ValidName
    private  String name;

    @NotNull
    @Size(min = 3, max = 10)
    private String lastName;

    @NotBlank
    //@Pattern(regexp = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$\n", message = "Por favor ingrese el correo en el formato correcto")
    private String email;

    //@NotEmpty
    //@Max()
    //@CreditCardNumber
    private Long phone;

    @Max(18)
    private byte age;

    @Digits(integer = 2,fraction = 3)
    private double height;

    @AssertFalse
    private boolean married;

    //@Past
    //@Future
    private LocalDate dateOfBirth;


    private DepartmentDTO departmentDTO;
}
