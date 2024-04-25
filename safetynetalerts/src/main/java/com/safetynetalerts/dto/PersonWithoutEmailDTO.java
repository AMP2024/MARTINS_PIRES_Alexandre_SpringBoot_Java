package com.safetynetalerts.dto;

import jakarta.json.bind.annotation.JsonbProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonWithoutEmailDTO {

    @JsonbProperty("firstName")
    private String firstName;

    @JsonbProperty("lastName")
    private String lastName;

    @JsonbProperty("address")
    private String address;

    @JsonbProperty("city")
    private String city;

    @JsonbProperty("zip")
    private String zip;

    @JsonbProperty("phone")
    private String phone;
}
