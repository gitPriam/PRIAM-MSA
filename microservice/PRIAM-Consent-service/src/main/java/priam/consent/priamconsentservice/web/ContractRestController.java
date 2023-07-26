package priam.consent.priamconsentservice.web;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import priam.consent.priamconsentservice.mappers.ConsentMapper;
import priam.consent.priamconsentservice.openfeign.DataSubjectRestClient;
import priam.consent.priamconsentservice.openfeign.ProcessingRestClient;
import priam.consent.priamconsentservice.repositories.ConsentRepository;
import priam.consent.priamconsentservice.repositories.ContractRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(path = "/api", produces = "application/json")
public class ContractRestController {

}
