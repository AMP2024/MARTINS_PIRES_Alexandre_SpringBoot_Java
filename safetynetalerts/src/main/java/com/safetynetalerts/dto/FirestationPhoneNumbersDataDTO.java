package com.safetynetalerts.dto;

import com.safetynetalerts.model.Firestation;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

// 3.URL On appellera le resultat FirestationPhoneNumbersDTO?

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FirestationPhoneNumbersDataDTO {

    private List<Firestation> firestations;
    private List<PersonAdressAndPhoneDTO> persons;
}
