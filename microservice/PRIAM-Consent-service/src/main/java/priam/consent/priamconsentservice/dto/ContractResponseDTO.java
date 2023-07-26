package priam.consent.priamconsentservice.dto;

import priam.consent.priamconsentservice.entities.DataSubject;

import javax.persistence.Transient;
import java.util.Date;

public class ContractResponseDTO {
    private int contractId;
    private Date signatureDate;
    private Date expirationDate;
    //private int dataSubjectId;
    private DataSubject dataSubject;
}
