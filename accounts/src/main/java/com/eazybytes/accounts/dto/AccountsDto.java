package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Schema(
    name = "Accounts",
    description = "Schema to hold Account information"
)
public class AccountsDto {

    @Schema(
        description = "Account number of Bank Account", example = "1234567890"
    )
    @NotEmpty(message = "Account number cannot be empty or null")
    @Pattern(regexp = "(^$|\\d{10})", message = "Account number must be 10 digits")
    private Long accountNumber;

    @Schema(
        description = "Account type of Bank Account", example = "Savings"
    )
    @NotEmpty(message = "Account type cannot be empty or null")
    private String accountType;

    @Schema(
        description = "Bank branch address", example = "123 Main St, Anytown, USA"
    )
    @NotEmpty(message = "Branch address cannot be empty or null")
    private String branchAddress;
}
