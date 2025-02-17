package com.aasha.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

@Document
@Data
@AllArgsConstructor
public class Person {
    @Id
    private UUID id;
    private String name;
    private Date dateOfBirth;
    private Gender gender;
    private String aadharNumber;
    private BankDetails bankDetails;
    private ContactDetails contactDetails;
}
