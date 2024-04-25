package com.safetynetalerts.dto;

import com.safetynetalerts.model.Firestation;
import com.safetynetalerts.model.MedicalRecord;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

// 4.URL Le fichier résultat on pourra l'appeler PersonsEmergencyInfoDTO
// Idée quand c'est des données brutes aavant traitement on ajoute "Data"

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonsEmergencyDataDTO {

    private List<Firestation> firestations;
    private List<MedicalRecord> medicalRecords;
    private List<PersonNameAdressPhoneDTO> persons;

}
