package com.eazybytes.loans.dto;

import lombok.Data;

@Data
public class LoansDto {

    private String mobileNumber;
    private String loanNumber;
    private String loanType;
    private Long totalLoan;
    private Long amountPaid;
    private Long outstandingAmount;
}
