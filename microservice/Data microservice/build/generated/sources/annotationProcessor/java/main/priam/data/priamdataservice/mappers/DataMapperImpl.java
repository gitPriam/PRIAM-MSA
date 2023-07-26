package priam.data.priamdataservice.mappers;

import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import priam.data.priamdataservice.dto.DataRequestDTO;
import priam.data.priamdataservice.dto.DataResponseDTO;
import priam.data.priamdataservice.entities.DSCategory;
import priam.data.priamdataservice.entities.Data;
import priam.data.priamdataservice.entities.DataType;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-21T11:19:57+0200",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.1.jar, environment: Java 11.0.16 (Oracle Corporation)"
)
@Component
public class DataMapperImpl implements DataMapper {

    @Override
    public DataResponseDTO DataToDataResponseDTO(Data data) {
        if ( data == null ) {
            return null;
        }

        DataResponseDTO dataResponseDTO = new DataResponseDTO();

        dataResponseDTO.setData_type_name( dataDataTypeDataTypeName( data ) );
        dataResponseDTO.setPrimary_key_name( dataDataTypePrimaryKeyName( data ) );
        dataResponseDTO.setData_type_id( dataDataTypeDataTypeId( data ) );
        dataResponseDTO.setDsCategory( data.getDsCategory() );
        dataResponseDTO.setId( data.getId() );
        dataResponseDTO.setAttribute( data.getAttribute() );
        dataResponseDTO.setPersonal( data.isPersonal() );
        dataResponseDTO.setCategory( data.getCategory() );
        dataResponseDTO.setSource( data.getSource() );
        dataResponseDTO.setDataConservation( data.getDataConservation() );
        dataResponseDTO.setPortable( data.isPortable() );
        dataResponseDTO.setPersonalDataCategory( data.getPersonalDataCategory() );

        return dataResponseDTO;
    }

    @Override
    public Data DataRequestDTOToData(DataRequestDTO dataRequestDTO) {
        if ( dataRequestDTO == null ) {
            return null;
        }

        Data data = new Data();

        data.setDataType( dataRequestDTOToDataType( dataRequestDTO ) );
        data.setDsCategory( dataRequestDTOToDSCategory( dataRequestDTO ) );
        data.setId( dataRequestDTO.getId() );
        data.setAttribute( dataRequestDTO.getAttribute() );
        data.setPersonal( dataRequestDTO.isPersonal() );
        data.setCategory( dataRequestDTO.getCategory() );
        data.setSource( dataRequestDTO.getSource() );
        data.setDataConservation( dataRequestDTO.getDataConservation() );
        data.setPortable( dataRequestDTO.isPortable() );
        data.setDscId( dataRequestDTO.getDscId() );
        data.setPersonalDataCategory( dataRequestDTO.getPersonalDataCategory() );

        return data;
    }

    private String dataDataTypeDataTypeName(Data data) {
        if ( data == null ) {
            return null;
        }
        DataType dataType = data.getDataType();
        if ( dataType == null ) {
            return null;
        }
        String dataTypeName = dataType.getDataTypeName();
        if ( dataTypeName == null ) {
            return null;
        }
        return dataTypeName;
    }

    private String dataDataTypePrimaryKeyName(Data data) {
        if ( data == null ) {
            return null;
        }
        DataType dataType = data.getDataType();
        if ( dataType == null ) {
            return null;
        }
        String primaryKeyName = dataType.getPrimaryKeyName();
        if ( primaryKeyName == null ) {
            return null;
        }
        return primaryKeyName;
    }

    private int dataDataTypeDataTypeId(Data data) {
        if ( data == null ) {
            return 0;
        }
        DataType dataType = data.getDataType();
        if ( dataType == null ) {
            return 0;
        }
        int dataTypeId = dataType.getDataTypeId();
        return dataTypeId;
    }

    protected DataType dataRequestDTOToDataType(DataRequestDTO dataRequestDTO) {
        if ( dataRequestDTO == null ) {
            return null;
        }

        DataType dataType = new DataType();

        dataType.setDataTypeId( dataRequestDTO.getData_type_id() );

        return dataType;
    }

    protected DSCategory dataRequestDTOToDSCategory(DataRequestDTO dataRequestDTO) {
        if ( dataRequestDTO == null ) {
            return null;
        }

        DSCategory dSCategory = new DSCategory();

        dSCategory.setDscId( dataRequestDTO.getDscId() );

        return dSCategory;
    }
}
