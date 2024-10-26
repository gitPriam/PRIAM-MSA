package org.priam.priamprocessingservice.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.priam.priamprocessingservice.dto.ProcessingRequestDTO;
import org.priam.priamprocessingservice.dto.ProcessingResponseDTO;
import org.priam.priamprocessingservice.entities.DataUsage;
import org.priam.priamprocessingservice.entities.Processing;
import org.priam.priamprocessingservice.entities.Purpose;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-25T12:38:27+0200",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.1.jar, environment: Java 11.0.16 (Oracle Corporation)"
)
@Component
public class ProcessingMapperImpl implements ProcessingMapper {

    @Override
    public Processing fromProcessingDTO(ProcessingRequestDTO processingRequestDTO) {
        if ( processingRequestDTO == null ) {
            return null;
        }

        Processing processing = new Processing();

        processing.setId( processingRequestDTO.getId() );
        processing.setName( processingRequestDTO.getName() );
        processing.setType( processingRequestDTO.getType() );
        processing.setCategory( processingRequestDTO.getCategory() );
        processing.setCreationDate( processingRequestDTO.getCreationDate() );
        processing.setUpdatingDate( processingRequestDTO.getUpdatingDate() );
        List<DataUsage> list = processingRequestDTO.getDataUsages();
        if ( list != null ) {
            processing.setDataUsages( new ArrayList<DataUsage>( list ) );
        }
        List<Purpose> list1 = processingRequestDTO.getPurposes();
        if ( list1 != null ) {
            processing.setPurposes( new ArrayList<Purpose>( list1 ) );
        }

        return processing;
    }

    @Override
    public ProcessingResponseDTO fromProcessing(Processing processing) {
        if ( processing == null ) {
            return null;
        }

        ProcessingResponseDTO processingResponseDTO = new ProcessingResponseDTO();

        processingResponseDTO.setId( processing.getId() );
        processingResponseDTO.setName( processing.getName() );
        processingResponseDTO.setType( processing.getType() );
        processingResponseDTO.setCategory( processing.getCategory() );
        processingResponseDTO.setCreationDate( processing.getCreationDate() );
        processingResponseDTO.setUpdatingDate( processing.getUpdatingDate() );
        List<DataUsage> list = processing.getDataUsages();
        if ( list != null ) {
            processingResponseDTO.setDataUsages( new ArrayList<DataUsage>( list ) );
        }
        List<Purpose> list1 = processing.getPurposes();
        if ( list1 != null ) {
            processingResponseDTO.setPurposes( new ArrayList<Purpose>( list1 ) );
        }

        return processingResponseDTO;
    }
}
