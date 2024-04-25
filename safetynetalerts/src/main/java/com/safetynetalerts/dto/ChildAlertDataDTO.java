package com.safetynetalerts.dto;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

//2.URL le fichier résultat pourra être appelé ChildAlertInfoDTO

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChildAlertDataDTO {

    private List<MedicalRecordWithoutMedInfoDTO> medicalRecordsWithoutMedInfo;
    private List<PersonNameAndAddressDTO> persons;
}
