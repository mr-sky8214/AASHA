package com.aasha.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ContactDetails {
    @Size(min = 10, max = 10)
    private String phoneNumber;

    @Email(message = "Valid Email Should be provided")
    private String emailId;
}
