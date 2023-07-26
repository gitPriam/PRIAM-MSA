package org.priam.priamprocessingservice.mappers;

import org.mapstruct.Mapper;
import org.priam.priamprocessingservice.dto.DataUsageRequestDTO;
import org.priam.priamprocessingservice.dto.DataUsageResponseDTO;
import org.priam.priamprocessingservice.dto.ProcessingRequestDTO;
import org.priam.priamprocessingservice.dto.ProcessingResponseDTO;
import org.priam.priamprocessingservice.entities.DataUsage;
import org.priam.priamprocessingservice.entities.Processing;
@Mapper(componentModel = "spring")
public interface DataUsageMapper {
    DataUsage fromDataUsageDTO(DataUsageRequestDTO dataUsageDTO);

    DataUsageResponseDTO fromDataUsage(DataUsage dataUsage);
}

