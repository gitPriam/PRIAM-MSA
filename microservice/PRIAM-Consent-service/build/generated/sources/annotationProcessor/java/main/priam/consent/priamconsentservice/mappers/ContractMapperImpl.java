package priam.consent.priamconsentservice.mappers;

import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import priam.consent.priamconsentservice.dto.ContractRequestDTO;
import priam.consent.priamconsentservice.dto.ContractResponseDTO;
import priam.consent.priamconsentservice.entities.Contract;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-25T14:20:23+0200",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.1.1.jar, environment: Java 11.0.16 (Oracle Corporation)"
)
@Component
public class ContractMapperImpl implements ContractMapper {

    @Override
    public Contract fromDataRequestRequestDTO(ContractRequestDTO dataRequestRequestDTO) {
        if ( dataRequestRequestDTO == null ) {
            return null;
        }

        Contract contract = new Contract();

        contract.setContractId( dataRequestRequestDTO.getContractId() );
        contract.setSignatureDate( dataRequestRequestDTO.getSignatureDate() );
        contract.setExpirationDate( dataRequestRequestDTO.getExpirationDate() );
        contract.setDataSubjectId( dataRequestRequestDTO.getDataSubjectId() );

        return contract;
    }

    @Override
    public ContractResponseDTO fromDataRequest(Contract contract) {
        if ( contract == null ) {
            return null;
        }

        ContractResponseDTO contractResponseDTO = new ContractResponseDTO();

        return contractResponseDTO;
    }
}
