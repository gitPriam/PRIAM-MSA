package org.priam.priamprocessingservice.web;

import lombok.AllArgsConstructor;
import org.priam.priamprocessingservice.dto.DataUsageResponseDTO;
import org.priam.priamprocessingservice.entities.DataUsage;
import org.priam.priamprocessingservice.services.DataUsageServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("processing/data-usage")
@AllArgsConstructor
public class DataUsageController {
    @Autowired
    DataUsageServiceInterface service;

    @PostMapping("/create")
    public DataUsage newDataUsage(DataUsage dataUsage) {
        return service.createDataUsage(dataUsage);
    }

    @PutMapping("/update")
    public DataUsage modifyDataUsage(DataUsage dataUsage) {
        return service.updateDataUsage(dataUsage);
    }

    @GetMapping("/")
    public Collection<DataUsage> getDataUsages(Long processingId){
        return service.getDataUsages(processingId);
    }

    @GetMapping("/{id}")
    public DataUsageResponseDTO getDataUsage(@PathVariable Long id) {
        return service.getDataUsage(id);
    }

}