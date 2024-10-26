package priam.consent.priamconsentservice.mappers;

import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import priam.consent.priamconsentservice.dto.ConsentRequestDTO;
import priam.consent.priamconsentservice.dto.ConsentResponseDTO;
import priam.consent.priamconsentservice.entities.Consent;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-25T14:20:23+0200",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.1.1.jar, environment: Java 11.0.16 (Oracle Corporation)"
)
@Component
public class ConsentMapperImpl implements ConsentMapper {

    @Override
    public Consent fromConsentRequestDTO(ConsentRequestDTO dataRequestRequestDTO) {
        if ( dataRequestRequestDTO == null ) {
            return null;
        }

        Consent consent = new Consent();

        consent.setConsentId( dataRequestRequestDTO.getConsentId() );
        consent.setStartDate( dataRequestRequestDTO.getStartDate() );
        consent.setEndDate( dataRequestRequestDTO.getEndDate() );
        consent.setContract( dataRequestRequestDTO.getContract() );
        consent.setProcessingId( dataRequestRequestDTO.getProcessingId() );

        return consent;
    }

    @Override
    public ConsentResponseDTO fromConsentRequest(Consent consent) {
        if ( consent == null ) {
            return null;
        }

        ConsentResponseDTO consentResponseDTO = new ConsentResponseDTO();

        consentResponseDTO.setConsentId( consent.getConsentId() );
        consentResponseDTO.setStartDate( consent.getStartDate() );
        consentResponseDTO.setEndDate( consent.getEndDate() );
        consentResponseDTO.setContract( consent.getContract() );
        consentResponseDTO.setProcessing( consent.getProcessing() );

        return consentResponseDTO;
    }
}
