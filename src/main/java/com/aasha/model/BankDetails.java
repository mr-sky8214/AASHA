package com.aasha.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BankDetails {
    private String bankName;
    private String bankAccountNumber;
}
