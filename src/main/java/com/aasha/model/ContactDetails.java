package com.aasha.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ContactDetails {
    private String phoneNumber;
    private String emailId;
}
