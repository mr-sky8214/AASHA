package com.aasha.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

@Document
@Data
@AllArgsConstructor
public class Person {
    @Transient
    public static final String SEQUENCE_NAME = "person_sequence";

    @Id
    private long id;
    private String name;
    private Date dateOfBirth;
    private Gender gender;
    private String aadharNumber;
    private BankDetails bankDetails;
    private ContactDetails contactDetails;
}
