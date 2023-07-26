package priam.consent.priamconsentservice.services;

import org.springframework.stereotype.Service;
import priam.consent.priamconsentservice.mappers.ConsentMapper;
import priam.consent.priamconsentservice.openfeign.DataSubjectRestClient;
import priam.consent.priamconsentservice.openfeign.ProcessingRestClient;
import priam.consent.priamconsentservice.repositories.ConsentRepository;
import priam.consent.priamconsentservice.repositories.ContractRepository;

import javax.annotation.Generated;
import javax.transaction.Transactional;

@Generated(
        value = "org.mapstruct.ap.MappingProcessor",
        date = "2021-05-23T23:03:41+0530"
)

@Service
@Transactional
public class ContractServiceImpl {
    private ConsentRepository consentRepository;
    private ContractRepository contractRepository;
    private ConsentMapper consentMapper;
    private ProcessingRestClient processingRestClient;
    private DataSubjectRestClient dataSubjectRestClient;

    public ContractServiceImpl(ContractRepository contractRepository, ConsentRepository consentRepository, ConsentMapper consentMapper,
                               ProcessingRestClient processingRestClient, DataSubjectRestClient dataSubjectRestClient) {
        this.contractRepository = contractRepository;
        this.consentRepository = consentRepository;
        this.consentMapper = consentMapper;
        this.processingRestClient = processingRestClient;
        this.dataSubjectRestClient = dataSubjectRestClient;
    }
}
