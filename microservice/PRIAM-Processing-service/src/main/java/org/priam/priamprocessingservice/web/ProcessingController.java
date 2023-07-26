package org.priam.priamprocessingservice.web;


import org.priam.priamprocessingservice.dto.*;
import org.priam.priamprocessingservice.entities.Processing;
import org.priam.priamprocessingservice.services.ProcessingService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(path = "/processing", produces = "application/json")
public class ProcessingController {


    private ProcessingService processingService;

    public ProcessingController(ProcessingService processingService) {
        this.processingService = processingService;
    }

    @PostMapping("/create")
    public Processing newProcessing(ProcessingRequestDTO processingRequestDTO) {
        return processingService.createProcessing(processingRequestDTO);
    }

    @PutMapping("/update/{processingId}")
    public ProcessingResponseDTO modifyProcessing(@PathVariable Long processingId, @RequestBody ProcessingRequestDTO processingRequestDTO) {
        return processingService.updateProcessing(processingId,processingRequestDTO);
    }

    @GetMapping("/{id}")
    public ProcessingResponseDTO getProcessing(@PathVariable Long id) {
        return processingService.getProcessing(id);
    }

    @GetMapping("/listProcessings")
    public Collection<Processing> getProcessings() {
        return processingService.getProcessings();
    }

    @GetMapping("/listProcessings/{dsc}")
    public Collection<ProcessingResponseDTO> getProcByDscID(@PathVariable int dsc) {
        return processingService.getProcessingsByDsc(dsc);
    }
}