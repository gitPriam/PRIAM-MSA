package org.priam.priamprocessingservice.dto;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.priam.priamprocessingservice.entities.Data;
import org.priam.priamprocessingservice.entities.Processing;

@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class DataUsageResponseDTO {
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
