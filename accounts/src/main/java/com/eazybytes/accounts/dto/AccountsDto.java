package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class AccountsDto {

    @NotEmpty(message = "Account number cannot be empty or null")
    @Pattern(regexp = "(^$|\\d{10})", message = "Account number must be 10 digits")
    private Long accountNumber;

    @NotEmpty(message = "Account type cannot be empty or null")
    private String accountType;

    @NotEmpty(message = "Branch address cannot be empty or null")
    private String branchAddress;
}
