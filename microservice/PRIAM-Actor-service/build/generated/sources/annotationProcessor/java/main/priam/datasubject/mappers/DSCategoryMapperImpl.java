package priam.datasubject.mappers;

import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import priam.datasubject.dto.DSCategoryResponseDTO;
import priam.datasubject.entities.DSCategory;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-21T11:11:45+0200",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.1.jar, environment: Java 11.0.16 (Oracle Corporation)"
)
@Component
public class DSCategoryMapperImpl implements DSCategoryMapper {

    @Override
    public DSCategoryResponseDTO DSCategoryToDSCategoryResponseDTO(DSCategory dsCategory) {
        if ( dsCategory == null ) {
            return null;
        }

        DSCategoryResponseDTO dSCategoryResponseDTO = new DSCategoryResponseDTO();

        dSCategoryResponseDTO.setDscId( dsCategory.getDscId() );
        dSCategoryResponseDTO.setDscName( dsCategory.getDscName() );
        dSCategoryResponseDTO.setLocationId( dsCategory.getLocationId() );

        return dSCategoryResponseDTO;
    }
}
