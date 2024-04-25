package com.safetynetalerts.dto;

import jakarta.json.bind.annotation.JsonbProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class PersonNameAdressPhoneDTO {

        @JsonbProperty("firstName")
        private String firstName;

        @JsonbProperty("lastName")
        private String lastName;

        @JsonbProperty("address")
        private String address;

        @JsonbProperty("phone")
        private String phone;
        
    }