package com.safetynetalerts.dto;

import jakarta.json.bind.annotation.JsonbProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 2.URL Structure pour créer des foyers de plusieurs membres

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HouseholdMemberDTO {

    @JsonbProperty("firstName")
    private String firstName;

    @JsonbProperty("lastName")
    private String lastName;

    private Integer age;

}
