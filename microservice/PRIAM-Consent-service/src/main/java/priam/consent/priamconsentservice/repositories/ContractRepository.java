package priam.consent.priamconsentservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import priam.consent.priamconsentservice.entities.Consent;
import priam.consent.priamconsentservice.entities.Contract;

public interface ContractRepository extends JpaRepository<Contract, Integer> {
}
