package org.priam.priamprocessingservice.services;

import org.priam.priamprocessingservice.dto.DataUsageResponseDTO;
import org.priam.priamprocessingservice.entities.DataUsage;

import java.util.Collection;
import java.util.Optional;

public interface DataUsageServiceInterface {
    DataUsage createDataUsage(DataUsage dataUsage);
    DataUsage updateDataUsage(DataUsage dataUsage);
    boolean deleteDataUsage(Long dataUsageId);
    DataUsageResponseDTO getDataUsage(Long dataUsageId);
    Collection<DataUsage> getDataUsages(Long processingId);
}
