package org.priam.priamprocessingservice.mappers;

import javax.annotation.Generated;
import org.priam.priamprocessingservice.dto.DataUsageRequestDTO;
import org.priam.priamprocessingservice.dto.DataUsageResponseDTO;
import org.priam.priamprocessingservice.entities.DataUsage;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-25T12:38:27+0200",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.1.jar, environment: Java 11.0.16 (Oracle Corporation)"
)
@Component
public class DataUsageMapperImpl implements DataUsageMapper {

    @Override
    public DataUsage fromDataUsageDTO(DataUsageRequestDTO dataUsageDTO) {
        if ( dataUsageDTO == null ) {
            return null;
        }

        DataUsage dataUsage = new DataUsage();

        dataUsage.setId( dataUsageDTO.getId() );
        dataUsage.setPersonalStatus( dataUsageDTO.isPersonalStatus() );
        dataUsage.setC( dataUsageDTO.isC() );
        dataUsage.setR( dataUsageDTO.isR() );
        dataUsage.setU( dataUsageDTO.isU() );
        dataUsage.setD( dataUsageDTO.isD() );
        dataUsage.setProcessing( dataUsageDTO.getProcessing() );
        dataUsage.setDataId( dataUsageDTO.getDataId() );
        dataUsage.setData( dataUsageDTO.getData() );

        return dataUsage;
    }

    @Override
    public DataUsageResponseDTO fromDataUsage(DataUsage dataUsage) {
        if ( dataUsage == null ) {
            return null;
        }

        DataUsageResponseDTO dataUsageResponseDTO = new DataUsageResponseDTO();

        dataUsageResponseDTO.setId( dataUsage.getId() );
        dataUsageResponseDTO.setPersonalStatus( dataUsage.isPersonalStatus() );
        dataUsageResponseDTO.setC( dataUsage.isC() );
        dataUsageResponseDTO.setR( dataUsage.isR() );
        dataUsageResponseDTO.setU( dataUsage.isU() );
        dataUsageResponseDTO.setD( dataUsage.isD() );
        dataUsageResponseDTO.setProcessing( dataUsage.getProcessing() );
        dataUsageResponseDTO.setDataId( dataUsage.getDataId() );
        dataUsageResponseDTO.setData( dataUsage.getData() );

        return dataUsageResponseDTO;
    }
}
