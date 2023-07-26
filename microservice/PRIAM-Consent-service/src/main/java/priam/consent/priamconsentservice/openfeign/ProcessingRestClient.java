package priam.consent.priamconsentservice.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import priam.consent.priamconsentservice.entities.Processing;

import java.util.Collection;

@FeignClient(name = "PROCESSING-SERVICE")
public interface ProcessingRestClient {

    @GetMapping("/processing/listProcessings/{dsc}")
    Collection<Processing> getProcByDscID(@PathVariable int dsc);

    @GetMapping("/processing/{id}")
    Processing getProcessing(@PathVariable int id);
}
