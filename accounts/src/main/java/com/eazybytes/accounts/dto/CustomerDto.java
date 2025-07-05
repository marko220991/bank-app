package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Schema(
    name = "Customer",
    description = "Schema to hold Customer and Account details"
)
public class CustomerDto {

    @Schema(
        description = "Name of the customer", example = "John Doe"
    )
    @NotEmpty(message = "Name cannot be empty or null")
    @Size(min = 5, message = "Customer name should have at least 5 characters")
    private String name;

    @Schema(
        description = "Email of the customer", example = "example@me.com"
    )
    @Email(message = "Email should be valid")
    @NotEmpty(message = "Email cannot be empty or null")
    private String email;

    @Schema(
        description = "Mobile number of the customer", example = "0123456789"
    )
    @Pattern(regexp = "(^$|\\d{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @Schema(
        description = "Account details of the customer"
    )
    private AccountsDto accountsDto;
}
