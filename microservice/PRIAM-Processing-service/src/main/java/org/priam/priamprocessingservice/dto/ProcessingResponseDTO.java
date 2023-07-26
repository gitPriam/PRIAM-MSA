package org.priam.priamprocessingservice.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.priam.priamprocessingservice.entities.Data;
import org.priam.priamprocessingservice.entities.DataUsage;
import org.priam.priamprocessingservice.entities.Purpose;
import org.priam.priamprocessingservice.enums.ProcessingCategory;
import org.priam.priamprocessingservice.enums.ProcessingType;

import java.util.Date;
import java.util.List;
@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class ProcessingResponseDTO {
    private Long id;
    private String name;
    private ProcessingType type;
    private ProcessingCategory category;
    private Date creationDate;
    private Date updatingDate;
    private List<DataUsage> dataUsages;
    private List<Purpose> purposes;
    //private Data data;
}
