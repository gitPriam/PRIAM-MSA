package priam.consent.priamconsentservice.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.Date;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Contract {
    @Id
    private int contractId;

    private Date signatureDate;
    private Date expirationDate;
    private int dataSubjectId;
    @Transient
    private DataSubject dataSubject;
}
