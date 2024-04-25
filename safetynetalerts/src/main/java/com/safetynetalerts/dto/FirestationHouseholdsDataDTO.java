package com.safetynetalerts.dto;

import com.safetynetalerts.model.Firestation;
import com.safetynetalerts.model.MedicalRecord;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

// 5.URL On pourra appeler le resultat FirestationHouseholdsInfoDTO

@Data
@NoArgsConstructor
public class FirestationHouseholdsDataDTO {

    private List<PersonNameAdressPhoneDTO> personNameAdressPhoneDTOs;
    private List<Firestation> firestations;
    private List<MedicalRecord> medicalRecords;

}