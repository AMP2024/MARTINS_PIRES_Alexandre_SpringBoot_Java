package com.safetynetalerts.model;

import jakarta.json.bind.annotation.JsonbProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicalRecord {

    @JsonbProperty("firstName")
    private String firstName;

    @JsonbProperty("lastName")
    private String lastName;

    @JsonbProperty("birthdate")
    private String birthdate;

    @JsonbProperty("medications")
    private List<String> medications;

    @JsonbProperty("allergies")
    private List<String> allergies;
}