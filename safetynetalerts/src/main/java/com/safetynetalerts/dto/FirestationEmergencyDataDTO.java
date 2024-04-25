package com.safetynetalerts.dto;

import com.safetynetalerts.model.Firestation;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

// 1.URL
//La Structure résultat on peut l'appeler FirestationEmergencyInfoDTO

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FirestationEmergencyDataDTO {

    private List<Firestation> firestations;
    private List<MedicalRecordWithoutMedInfoDTO> medicalRecordsWithoutMedInfo;
    private List<PersonWithoutEmailDTO> personsWithoutEmail;

}