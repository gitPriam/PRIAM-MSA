package priam.consent.priamconsentservice.services;

import priam.consent.priamconsentservice.dto.ConsentRequestDTO;
import priam.consent.priamconsentservice.dto.ConsentResponseDTO;
import priam.consent.priamconsentservice.entities.Processing;

import java.util.Collection;

public interface ConsentService {
    ConsentResponseDTO create(ConsentRequestDTO consentRequestDTO);
    ConsentResponseDTO updateConsent(int id,ConsentRequestDTO consentRequestDTO);

    ConsentResponseDTO getConsent(int consentId);

    Collection<Processing> getProcessingListByDsc(int dsc);
}
