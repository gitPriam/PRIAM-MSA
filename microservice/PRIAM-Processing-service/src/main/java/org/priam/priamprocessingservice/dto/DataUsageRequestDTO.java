package org.priam.priamprocessingservice.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.priam.priamprocessingservice.entities.Data;
import org.priam.priamprocessingservice.entities.Processing;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class DataUsageRequestDTO {
    private Long id;

    private boolean personalStatus;

    private boolean c;

    private boolean r;

    private boolean u;

    private boolean d;

    private Processing processing;

    private int dataId;

    private Data data;

}
