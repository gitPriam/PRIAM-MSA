package priam.datasubject.mappers;

import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import priam.datasubject.dto.DataSubjectRequestDTO;
import priam.datasubject.dto.DataSubjectResponseDTO;
import priam.datasubject.entities.DSCategory;
import priam.datasubject.entities.DataSubject;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-21T11:11:45+0200",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.1.jar, environment: Java 11.0.16 (Oracle Corporation)"
)
@Component
public class DataSubjectMapperImpl implements DataSubjectMapper {

    @Override
    public DataSubjectResponseDTO DataSubjectToDataSubjectResponseDTO(DataSubject dataSubject) {
        if ( dataSubject == null ) {
            return null;
        }

        DataSubjectResponseDTO dataSubjectResponseDTO = new DataSubjectResponseDTO();

        dataSubjectResponseDTO.setDscId( dataSubjectDsCategoryDscId( dataSubject ) );
        dataSubjectResponseDTO.setDscName( dataSubjectDsCategoryDscName( dataSubject ) );
        dataSubjectResponseDTO.setId( dataSubject.getId() );
        dataSubjectResponseDTO.setAge( dataSubject.getAge() );
        dataSubjectResponseDTO.setIdRef( dataSubject.getIdRef() );
        dataSubjectResponseDTO.setUsername( dataSubject.getUsername() );
        dataSubjectResponseDTO.setPassword( dataSubject.getPassword() );

        return dataSubjectResponseDTO;
    }

    @Override
    public DataSubject DataSubjectRequestDTOToDataSubject(DataSubjectRequestDTO dataSubjectRequestDTO) {
        if ( dataSubjectRequestDTO == null ) {
            return null;
        }

        DataSubject dataSubject = new DataSubject();

        dataSubject.setDsCategory( dataSubjectRequestDTOToDSCategory( dataSubjectRequestDTO ) );
        dataSubject.setId( dataSubjectRequestDTO.getId() );
        dataSubject.setIdRef( dataSubjectRequestDTO.getIdRef() );
        dataSubject.setUsername( dataSubjectRequestDTO.getUsername() );
        dataSubject.setPassword( dataSubjectRequestDTO.getPassword() );
        dataSubject.setAge( dataSubjectRequestDTO.getAge() );

        return dataSubject;
    }

    private int dataSubjectDsCategoryDscId(DataSubject dataSubject) {
        if ( dataSubject == null ) {
            return 0;
        }
        DSCategory dsCategory = dataSubject.getDsCategory();
        if ( dsCategory == null ) {
            return 0;
        }
        int dscId = dsCategory.getDscId();
        return dscId;
    }

    private String dataSubjectDsCategoryDscName(DataSubject dataSubject) {
        if ( dataSubject == null ) {
            return null;
        }
        DSCategory dsCategory = dataSubject.getDsCategory();
        if ( dsCategory == null ) {
            return null;
        }
        String dscName = dsCategory.getDscName();
        if ( dscName == null ) {
            return null;
        }
        return dscName;
    }

    protected DSCategory dataSubjectRequestDTOToDSCategory(DataSubjectRequestDTO dataSubjectRequestDTO) {
        if ( dataSubjectRequestDTO == null ) {
            return null;
        }

        DSCategory dSCategory = new DSCategory();

        dSCategory.setDscId( dataSubjectRequestDTO.getDscId() );

        return dSCategory;
    }
}
