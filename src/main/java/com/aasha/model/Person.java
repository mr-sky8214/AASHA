package com.aasha.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

@Document
@CompoundIndex(
        name = "XIE1_Person",
        def = "{'name.firstName': 1, 'name.middleName': 1, 'name.lastName': 1, 'dateOfBirth': 1, 'aadharNumber' : 1}",
        unique = true
)
@Data
@AllArgsConstructor
public class Person {
    @Id
    private UUID id;
    private Name name;
    private Date dateOfBirth;
    private Gender gender;
    @Size(min = 12, max = 12)
    private String aadharNumber;
    private BankDetails bankDetails;
    private ContactDetails contactDetails;
}
