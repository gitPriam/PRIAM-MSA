package priam.consent.priamconsentservice.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import priam.consent.priamconsentservice.dto.ConsentRequestDTO;
import priam.consent.priamconsentservice.dto.ConsentResponseDTO;
import priam.consent.priamconsentservice.entities.Consent;
import priam.consent.priamconsentservice.entities.Processing;
import priam.consent.priamconsentservice.mappers.ConsentMapper;
import priam.consent.priamconsentservice.openfeign.DataSubjectRestClient;
import priam.consent.priamconsentservice.openfeign.ProcessingRestClient;
import priam.consent.priamconsentservice.repositories.ConsentRepository;

import javax.annotation.Generated;
import javax.transaction.Transactional;
import java.util.Collection;
import java.util.Date;

@Generated(
        value = "org.mapstruct.ap.MappingProcessor",
        date = "2021-05-23T23:03:41+0530"
)

@Service
@Transactional
public class ConsentServiceImpl implements ConsentService{
    private ConsentRepository consentRepository;
    private ConsentMapper consentMapper;
    private ProcessingRestClient processingRestClient;

    public ConsentServiceImpl(ConsentRepository consentRepository, ConsentMapper consentMapper,
                                  ProcessingRestClient processingRestClient) {
        this.consentRepository = consentRepository;
        this.consentMapper = consentMapper;
        this.processingRestClient = processingRestClient;
    }

    @Override
    public ConsentResponseDTO create(ConsentRequestDTO consentRequestDTO) {
        Consent data = consentMapper.fromConsentRequestDTO(consentRequestDTO);
        Consent saveData = consentRepository.save(data);
        return consentMapper.fromConsentRequest(saveData);
    }

    @Override
    public ConsentResponseDTO updateConsent(int id,ConsentRequestDTO consentRequestDTO) {

        Consent consent = consentMapper.fromConsentRequestDTO(consentRequestDTO);
        Consent oldConsent = consentRepository.findById(id).get();
        oldConsent.setContract(consent.getContract());
        oldConsent.setProcessingId(consent.getProcessingId());
        oldConsent.setStartDate(consent.getStartDate());
        oldConsent.setEndDate(consent.getEndDate());

        consentRepository.save(oldConsent);
        return consentMapper.fromConsentRequest(oldConsent);
    }


    @Override
    public ConsentResponseDTO getConsent(int consentId) {
        Consent consent = consentRepository.findById(consentId).get();
        consent.setProcessing(processingRestClient.getProcessing(consent.getProcessingId()));
        return consentMapper.fromConsentRequest(consent);
    }
    @Override
    public Collection<Processing> getProcessingListByDsc(int dsc){
        return processingRestClient.getProcByDscID(dsc);
    }
}
