package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class CustomerDto {

    @NotEmpty(message = "Name cannot be empty or null")
    @Size(min = 5, message = "Customer name should have at least 5 characters")
    private String name;

    @Email(message = "Email should be valid")
    @NotEmpty(message = "Email cannot be empty or null")
    private String email;

    @Pattern(regexp = "(^$|\\d{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;
    private AccountsDto accountsDto;
}
