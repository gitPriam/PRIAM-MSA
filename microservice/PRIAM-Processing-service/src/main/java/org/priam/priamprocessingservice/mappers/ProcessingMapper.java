package org.priam.priamprocessingservice.mappers;


import org.mapstruct.Mapper;
import org.priam.priamprocessingservice.dto.ProcessingRequestDTO;
import org.priam.priamprocessingservice.dto.ProcessingResponseDTO;
import org.priam.priamprocessingservice.entities.Processing;
@Mapper(componentModel = "spring")
public interface ProcessingMapper {
    Processing fromProcessingDTO(ProcessingRequestDTO processingRequestDTO);

    ProcessingResponseDTO fromProcessing(Processing processing);
}

