package org.priam.priamprocessingservice.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.priam.priamprocessingservice.dto.DataUsageResponseDTO;
import org.priam.priamprocessingservice.entities.Data;
import org.priam.priamprocessingservice.entities.DataUsage;
import org.priam.priamprocessingservice.mappers.DataUsageMapper;
import org.priam.priamprocessingservice.mappers.ProcessingMapper;
import org.priam.priamprocessingservice.openfeign.DataRestClient;
import org.priam.priamprocessingservice.repositories.DataUsageRepository;
import org.priam.priamprocessingservice.repositories.ProcessingRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Generated;
import javax.transaction.Transactional;
import java.util.Collection;
import java.util.Optional;

@Generated(
        value = "org.mapstruct.ap.MappingProcessor",
        date = "2021-05-23T23:03:41+0530"
)

@Slf4j
@Transactional
@Service
public class DataUsageService implements DataUsageServiceInterface{

    private DataUsageRepository dataUsageRepository;
    private DataUsageMapper dataUsageMapper;

    private DataRestClient dataRestClient;

    public DataUsageService(DataUsageMapper dataUsageMapper, DataUsageRepository dataUsageRepository, DataRestClient dataRestClient) {
        this.dataUsageMapper = dataUsageMapper;
        this.dataUsageRepository = dataUsageRepository;
        this.dataRestClient = dataRestClient;
    }
    @Override
    public DataUsage createDataUsage(DataUsage dataUsage) {
        //log.info("CreateDataUsage start Process !");
        DataUsage res = dataUsageRepository.save(dataUsage);
        //log.info("CreateDataUsage end Process !");
        return res;
    }

    @Override
    public DataUsage updateDataUsage(DataUsage dataUsage) {
        //log.info("UpdateDataUsage start Process !");
        DataUsage res = dataUsageRepository.save(dataUsage);
        //log.info("UpdateDataUsage end Process !");
        return res;
    }

    @Override
    public boolean deleteDataUsage(Long dataUsageId) {
        dataUsageRepository.deleteById(dataUsageId);
        return true;
    }

    @Override
    public DataUsageResponseDTO getDataUsage(Long dataUsageId) {
        DataUsage dataUsage = dataUsageRepository.findById(dataUsageId).get();
        Data data = dataRestClient.getData(dataUsage.getDataId());
        dataUsage.setData(data);
        return dataUsageMapper.fromDataUsage(dataUsage);/*.orElseThrow();*/
    }

    @Override
    public Collection<DataUsage> getDataUsages(Long processingId) {
        //Collection<DataUsage> datausages = dataUsageRepository.findAll();
        Collection<DataUsage> datausages = dataUsageRepository.findAllByProcessingId(processingId);
        for (DataUsage d: datausages){
            d.setData(dataRestClient.getData(d.getDataId()));
        }
        return datausages;
    }
}
