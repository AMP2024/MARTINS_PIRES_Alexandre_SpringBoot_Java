package com.safetynetalerts.dto;

import jakarta.json.bind.annotation.JsonbProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonAdressAndPhoneDTO {

    @JsonbProperty("address")
    private String address;

    @JsonbProperty("phone")
    private String phone;

}