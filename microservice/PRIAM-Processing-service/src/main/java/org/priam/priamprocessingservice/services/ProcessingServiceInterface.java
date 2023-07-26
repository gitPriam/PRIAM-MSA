package org.priam.priamprocessingservice.services;

import org.priam.priamprocessingservice.dto.ProcessingRequestDTO;
import org.priam.priamprocessingservice.dto.ProcessingResponseDTO;
import org.priam.priamprocessingservice.entities.DataUsage;
import org.priam.priamprocessingservice.entities.Processing;

import java.util.Collection;
import java.util.Optional;

public interface ProcessingServiceInterface {
    Processing createProcessing(ProcessingRequestDTO processingRequestDTO);
    ProcessingResponseDTO updateProcessing(Long processingID, ProcessingRequestDTO processingRequestDTO);
    boolean deleteProcessing(Long processingId);
    ProcessingResponseDTO getProcessing(Long processingId);
    Collection<Processing> getProcessings();

    Collection<ProcessingResponseDTO> getProcessingsByDsc(int dscId);

}
