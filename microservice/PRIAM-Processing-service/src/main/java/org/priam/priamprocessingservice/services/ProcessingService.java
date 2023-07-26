package org.priam.priamprocessingservice.services;

import org.priam.priamprocessingservice.dto.DataSubjectCategory;
import org.priam.priamprocessingservice.dto.ProcessingRequestDTO;
import org.priam.priamprocessingservice.dto.ProcessingResponseDTO;
import org.priam.priamprocessingservice.entities.Data;
import org.priam.priamprocessingservice.entities.DataUsage;
import org.priam.priamprocessingservice.entities.Processing;
import org.priam.priamprocessingservice.mappers.DataUsageMapper;
import org.priam.priamprocessingservice.mappers.ProcessingMapper;
import org.priam.priamprocessingservice.openfeign.DataRestClient;
import org.priam.priamprocessingservice.repositories.ProcessingRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Generated;
import javax.transaction.Transactional;
import java.util.*;

@Generated(
        value = "org.mapstruct.ap.MappingProcessor",
        date = "2021-05-23T23:03:41+0530"
)
@Transactional
@Service
public class ProcessingService implements ProcessingServiceInterface  {


    private ProcessingMapper processingMapper;
    private DataUsageService dataUsageService;
    private ProcessingRepository processingRepository;

    private DataRestClient dataRestClient;

    public ProcessingService(ProcessingMapper processingMapper, ProcessingRepository processingRepository, DataRestClient dataRestClient,
                             DataUsageService dataUsageService) {
        this.processingMapper = processingMapper;
        this.processingRepository = processingRepository;
        this.dataRestClient = dataRestClient;
        this.dataUsageService = dataUsageService;
    }
    @Override
    public Processing createProcessing(ProcessingRequestDTO processingRequestDTO) {
        Processing processing = processingMapper.fromProcessingDTO(processingRequestDTO);
        Processing res = processingRepository.save(processing);
        return res;
    }

    @Override
    public ProcessingResponseDTO updateProcessing(Long id,ProcessingRequestDTO processingRequestDTO) {
        //log.info("UpdateProcessing start Process !");
        Processing processing = processingMapper.fromProcessingDTO(processingRequestDTO);
        Processing oldProcessing = processingRepository.findById(id).get();
        oldProcessing.setCategory(processing.getCategory());
        oldProcessing.setCreationDate(processing.getCreationDate());
        oldProcessing.setDataUsages(processing.getDataUsages());
        oldProcessing.setMesures(processing.getMesures());
        oldProcessing.setName(processing.getName());
        oldProcessing.setPurposes(processing.getPurposes());
        oldProcessing.setType(processing.getType());
        oldProcessing.setUpdatingDate(new Date());
        processingRepository.save(oldProcessing);
        return processingMapper.fromProcessing(oldProcessing);
    }

    @Override
    public boolean deleteProcessing(Long processingId) {
        processingRepository.deleteById(processingId);
        return true;
    }

    @Override
    public ProcessingResponseDTO getProcessing(Long processingId) {
        Processing processing = processingRepository.findById(processingId).get();
        //processing.setDataUsages((List<DataUsage>)dataUsageService.getDataUsages(processingId));
        return processingMapper.fromProcessing(processing);
    }

    @Override
    public Collection<Processing> getProcessings() {
        Collection<Processing> processings = processingRepository.findAll();
        for (Processing processing: processings){
            processing.setDataUsages((List<DataUsage>)dataUsageService.getDataUsages(processing.getId()));
        }
        return processings;
        //return processingRepository.findAll();
    }

    @Override
    public Collection<ProcessingResponseDTO> getProcessingsByDsc(int dscId){
        Collection<Processing> processings = getProcessings();
        List<Integer> personalDataId = new LinkedList<>();
        Collection<ProcessingResponseDTO> processingsDsc = new LinkedList<>();

        for (Data data: dataRestClient.getPersonalDataByDSCategory(dscId)){
            personalDataId.add(data.getId());
        }

        for (Processing processing: processings){
            int cpt = 0;
            for (DataUsage dataUsage: processing.getDataUsages()){
                System.out.println("donnée personnelles "+ personalDataId );
                System.out.println("donnée personnelles du processing "+ dataUsage.getDataId() );
                   if (personalDataId.contains(dataUsage.getDataId()))
                   {
                       cpt ++;
                       break;
                   }
            }

            if(cpt != 0) processingsDsc.add(processingMapper.fromProcessing(processing));
        }

        return processingsDsc;
    }
}