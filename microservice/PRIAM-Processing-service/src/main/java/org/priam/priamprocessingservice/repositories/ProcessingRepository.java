package org.priam.priamprocessingservice.repositories;

import org.priam.priamprocessingservice.entities.Processing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessingRepository extends JpaRepository<Processing, Long> {

}