package priam.datarequest.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import priam.datarequest.dto.DataRequestRequestDTO;
import priam.datarequest.dto.DataRequestResponseDTO;
import priam.datarequest.dto.RequestAnswerRequestDTO;
import priam.datarequest.services.DataRequestService;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(path = "/api", produces = "application/json")
public class DataRequestRestController {
    private DataRequestService dataRequestService;

    public DataRequestRestController(DataRequestService dataRequestService) {
        this.dataRequestService = dataRequestService;
    }

    @GetMapping(path = "/requestsRectification")
    public List<DataRequestResponseDTO> getListRequests() {
        return dataRequestService.getListRectificationRequests();
    }

    @GetMapping(path = "/requestsErasure")
    public List<DataRequestResponseDTO> getListErasureRequests() {
        return dataRequestService.getListErasureRequests();
    }

    @GetMapping(path = "/dataRequestRectification/{id}")
    public DataRequestResponseDTO getDataRequest(@PathVariable int id) {
        return dataRequestService.getDataRequest(id);
    }

    @PostMapping(path = "/params")
    public DataRequestResponseDTO RectificationRequest(@RequestBody DataRequestRequestDTO dataRequest/*String idRef,@RequestBody String attribute,@RequestBody String newValue,@RequestBody String claim*/) {
        return dataRequestService.saveRectificationRequest(dataRequest.getIdRef(),dataRequest.getAttribute(),dataRequest.getNewValue(),dataRequest.getClaim(), dataRequest.getPrimaryKeyValue());
    }

    @PostMapping(path = "/erasureParams")
    public DataRequestResponseDTO ErasureRequest(@RequestBody DataRequestRequestDTO dataRequest) {
        return dataRequestService.saveErasureRequest(dataRequest.getIdRef(),dataRequest.getAttribute(),dataRequest.getClaim(), dataRequest.getPrimaryKeyValue());
    }

    @PostMapping(path = "/answerRectification")
    public DataRequestResponseDTO saveRectificationAnswer(@RequestBody RequestAnswerRequestDTO requestAnswer) {
        return dataRequestService.RectificationAnswer(requestAnswer.getIdDataRequest(),requestAnswer.isAnswer(),requestAnswer.getClaimAnswer());
    }

    @PostMapping(path = "/answerErasure")
    public DataRequestResponseDTO saveErasureAnswer(@RequestBody RequestAnswerRequestDTO requestAnswer) {
        return dataRequestService.ErasureAnswer(requestAnswer.getIdDataRequest(),requestAnswer.isAnswer(),requestAnswer.getClaimAnswer());
    }

    @GetMapping(path = "/requestsRectification/{id}")
    public List<DataRequestResponseDTO> getListDataRequestByDataSubject(@PathVariable(name = "id") int dataSubjectId) {
        return dataRequestService.getListDataRequest(dataSubjectId);
    }

 @GetMapping(path = "/personalDataValues/accessRight")
 public List<Map<String, String>> DataAccess(@RequestParam int idDS, @RequestParam String dataTypeName, @RequestParam List<String> attributes) {
     System.out.println("recupération c bn "+idDS+dataTypeName+attributes);
     return dataRequestService.DataAccess(idDS,dataTypeName,attributes);
 }

}
