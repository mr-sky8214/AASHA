package com.aasha.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Name {
    @NotNull(message = "First Name Should not be null")
    private String firstName;

    @NotNull(message = "Middle Name Should not be null")
    private String middleName;

    @NotNull(message = "Last Name Should not be null")
    private String lastName;
}
