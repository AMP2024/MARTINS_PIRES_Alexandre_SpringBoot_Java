package com.safetynetalerts.dto;

import jakarta.json.bind.annotation.JsonbProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 7.URL

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonsCityAndEmailDTO {

    @JsonbProperty("city")
    private String city;

    @JsonbProperty("email")
    private String email;
}