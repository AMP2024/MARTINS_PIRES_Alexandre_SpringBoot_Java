package com.safetynetalerts.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
public class HouseholdDTO {

    private List<HouseholdMemberDTO> householdMemberDTOs;
    private Integer adults;
    private Integer children;

}