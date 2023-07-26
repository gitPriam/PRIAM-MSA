package priam.data.priamdataservice.openfeign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import priam.data.priamdataservice.entities.DSCategory;

@FeignClient(name = "DATA-SUBJECT-SERVICE")
public interface DataSubjectRestClient {

    @GetMapping(path = "api/DSCategory/{dscId}")
    public DSCategory getDSCategoryById(@PathVariable int dscId);
}
