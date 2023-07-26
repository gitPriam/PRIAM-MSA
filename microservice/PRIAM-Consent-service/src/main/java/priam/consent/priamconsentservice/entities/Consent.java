package priam.consent.priamconsentservice.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import java.util.Date;
@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Consent {
    @Id
    private int consentId;
    private Date startDate;
    private Date endDate;
    @JsonBackReference
    @ManyToOne
    private Contract contract;
    private int processingId;
    @Transient
    private Processing processing;

}
