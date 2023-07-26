package org.provider_microservice.mappers;

import javax.annotation.Generated;
import org.provider_microservice.dto.ProviderViewRequestDTO;
import org.provider_microservice.dto.ProviderViewResponseDTO;
import org.provider_microservice.entities.ProviderView;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-16T12:26:44+0200",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.1.jar, environment: Java 11.0.16 (Oracle Corporation)"
)
@Component
public class ProviderViewMapperImpl implements ProviderViewMapper {

    @Override
    public ProviderViewResponseDTO VueNutritionToVueNutritionResponseDTO(ProviderView vueNutrition) {
        if ( vueNutrition == null ) {
            return null;
        }

        ProviderViewResponseDTO providerViewResponseDTO = new ProviderViewResponseDTO();

        providerViewResponseDTO.setPu_ID( vueNutrition.getPu_ID() );
        providerViewResponseDTO.setPo_ID( vueNutrition.getPo_ID() );
        providerViewResponseDTO.setPo_ADDRESS1( vueNutrition.getPo_ADDRESS1() );
        providerViewResponseDTO.setPo_CREDITCARDCOMPANY( vueNutrition.getPo_CREDITCARDCOMPANY() );
        providerViewResponseDTO.setPu_USERNAME( vueNutrition.getPu_USERNAME() );
        providerViewResponseDTO.setPu_EMAIL( vueNutrition.getPu_EMAIL() );

        return providerViewResponseDTO;
    }

    @Override
    public ProviderView VueNutritionRequestDTOToVueNutrition(ProviderViewRequestDTO vueNutritionRequestDTO) {
        if ( vueNutritionRequestDTO == null ) {
            return null;
        }

        ProviderView providerView = new ProviderView();

        providerView.setPu_ID( vueNutritionRequestDTO.getPu_ID() );
        providerView.setPo_ID( vueNutritionRequestDTO.getPo_ID() );
        providerView.setPo_ADDRESS1( vueNutritionRequestDTO.getPo_ADDRESS1() );
        providerView.setPo_CREDITCARDCOMPANY( vueNutritionRequestDTO.getPo_CREDITCARDCOMPANY() );
        providerView.setPu_USERNAME( vueNutritionRequestDTO.getPu_USERNAME() );
        providerView.setPu_EMAIL( vueNutritionRequestDTO.getPu_EMAIL() );

        return providerView;
    }
}
