package priam.datarequest.mappers;

import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import priam.datarequest.dto.DataRequestRequestDTO;
import priam.datarequest.dto.DataRequestResponseDTO;
import priam.datarequest.entities.DataRequest;
import priam.datarequest.enums.TypeDataRequest;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-21T14:01:10+0200",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.1.jar, environment: Java 11.0.16 (Oracle Corporation)"
)
@Component
public class DataRequestMapperImpl implements DataRequestMapper {

    @Override
    public DataRequest fromDataRequestRequestDTO(DataRequestRequestDTO dataRequestRequestDTO) {
        if ( dataRequestRequestDTO == null ) {
            return null;
        }

        DataRequest dataRequest = new DataRequest();

        dataRequest.setId( dataRequestRequestDTO.getId() );
        dataRequest.setClaim( dataRequestRequestDTO.getClaim() );
        dataRequest.setNewValue( dataRequestRequestDTO.getNewValue() );
        dataRequest.setIsolated( dataRequestRequestDTO.isIsolated() );
        if ( dataRequestRequestDTO.getType() != null ) {
            dataRequest.setType( Enum.valueOf( TypeDataRequest.class, dataRequestRequestDTO.getType() ) );
        }
        dataRequest.setDataSubjectId( dataRequestRequestDTO.getDataSubjectId() );
        dataRequest.setDataId( dataRequestRequestDTO.getDataId() );
        dataRequest.setPrimaryKeyValue( dataRequestRequestDTO.getPrimaryKeyValue() );
        dataRequest.setResponse( dataRequestRequestDTO.isResponse() );

        return dataRequest;
    }

    @Override
    public DataRequestResponseDTO fromDataRequest(DataRequest dataRequest) {
        if ( dataRequest == null ) {
            return null;
        }

        DataRequestResponseDTO dataRequestResponseDTO = new DataRequestResponseDTO();

        dataRequestResponseDTO.setId( dataRequest.getId() );
        dataRequestResponseDTO.setClaim( dataRequest.getClaim() );
        dataRequestResponseDTO.setClaimDate( dataRequest.getClaimDate() );
        dataRequestResponseDTO.setNewValue( dataRequest.getNewValue() );
        dataRequestResponseDTO.setIsolated( dataRequest.isIsolated() );
        dataRequestResponseDTO.setType( dataRequest.getType() );
        dataRequestResponseDTO.setData( dataRequest.getData() );
        dataRequestResponseDTO.setDataSubject( dataRequest.getDataSubject() );
        dataRequestResponseDTO.setPrimaryKeyValue( dataRequest.getPrimaryKeyValue() );
        dataRequestResponseDTO.setResponse( dataRequest.isResponse() );

        return dataRequestResponseDTO;
    }
}
