package priam.data.priamdataservice.mappers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import priam.data.priamdataservice.dto.DataResponseDTO;
import priam.data.priamdataservice.dto.DataTypeResponseDTO;
import priam.data.priamdataservice.entities.Data;
import priam.data.priamdataservice.entities.DataType;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-21T11:19:57+0200",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.1.jar, environment: Java 11.0.16 (Oracle Corporation)"
)
@Component
public class DataTypeMapperImpl implements DataTypeMapper {

    @Override
    public DataTypeResponseDTO DataTypeToDataTypeResponseDTO(DataType dataType) {
        if ( dataType == null ) {
            return null;
        }

        DataTypeResponseDTO dataTypeResponseDTO = new DataTypeResponseDTO();

        dataTypeResponseDTO.setDataTypeId( dataType.getDataTypeId() );
        if ( dataType.getDataTypeName() != null ) {
            dataTypeResponseDTO.setDataTypeName( Integer.parseInt( dataType.getDataTypeName() ) );
        }
        dataTypeResponseDTO.setDataList( dataCollectionToDataResponseDTOList( dataType.getDataList() ) );
        dataTypeResponseDTO.setPrimaryKeyName( dataType.getPrimaryKeyName() );

        return dataTypeResponseDTO;
    }

    protected DataResponseDTO dataToDataResponseDTO(Data data) {
        if ( data == null ) {
            return null;
        }

        DataResponseDTO dataResponseDTO = new DataResponseDTO();

        dataResponseDTO.setId( data.getId() );
        dataResponseDTO.setAttribute( data.getAttribute() );
        dataResponseDTO.setPersonal( data.isPersonal() );
        dataResponseDTO.setCategory( data.getCategory() );
        dataResponseDTO.setSource( data.getSource() );
        dataResponseDTO.setDataConservation( data.getDataConservation() );
        dataResponseDTO.setPortable( data.isPortable() );
        dataResponseDTO.setDsCategory( data.getDsCategory() );
        dataResponseDTO.setPersonalDataCategory( data.getPersonalDataCategory() );

        return dataResponseDTO;
    }

    protected List<DataResponseDTO> dataCollectionToDataResponseDTOList(Collection<Data> collection) {
        if ( collection == null ) {
            return null;
        }

        List<DataResponseDTO> list = new ArrayList<DataResponseDTO>( collection.size() );
        for ( Data data : collection ) {
            list.add( dataToDataResponseDTO( data ) );
        }

        return list;
    }
}
