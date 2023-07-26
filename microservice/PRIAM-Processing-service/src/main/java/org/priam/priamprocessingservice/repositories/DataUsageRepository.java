package org.priam.priamprocessingservice.repositories;

import org.priam.priamprocessingservice.entities.DataUsage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface DataUsageRepository extends JpaRepository<DataUsage, Long> {
    Collection<DataUsage>findAllByProcessingId(Long processingId);
}