package priam.consent.priamconsentservice.mappers;

import org.mapstruct.Mapper;
import priam.consent.priamconsentservice.dto.ConsentRequestDTO;
import priam.consent.priamconsentservice.dto.ConsentResponseDTO;
import priam.consent.priamconsentservice.entities.Consent;

@Mapper(componentModel = "spring")
public interface ConsentMapper {
    Consent fromConsentRequestDTO(ConsentRequestDTO dataRequestRequestDTO);

    ConsentResponseDTO fromConsentRequest(Consent consent);
}
