package priam.consent.priamconsentservice.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import priam.consent.priamconsentservice.entities.DataSubject;

import javax.persistence.Transient;
import java.util.Date;
@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class ContractRequestDTO {
    private int contractId;
    private Date signatureDate;
    private Date expirationDate;
    private int dataSubjectId;
    //private DataSubject dataSubject;
}
