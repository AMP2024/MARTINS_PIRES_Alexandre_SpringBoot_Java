package com.safetynetalerts.model;

import jakarta.json.bind.annotation.JsonbProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Firestation {

    @JsonbProperty("address")
    private String address;

    @JsonbProperty("station")
    private String station;
}