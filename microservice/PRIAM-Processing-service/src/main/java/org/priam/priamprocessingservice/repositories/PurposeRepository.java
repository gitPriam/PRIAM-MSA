package org.priam.priamprocessingservice.repositories;

import org.priam.priamprocessingservice.entities.Purpose;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurposeRepository extends JpaRepository<Purpose, Integer> {

}
