package org.priam.priamprocessingservice.repositories;

import org.priam.priamprocessingservice.entities.Mesure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MesureRepository extends JpaRepository<Mesure, Integer> {

}
