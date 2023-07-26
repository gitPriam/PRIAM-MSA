package priam.datarequest.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import priam.datarequest.entities.Data;
import priam.datarequest.entities.DataType;

import java.util.List;

@FeignClient(name ="DATA-SERVICE")
public interface DataRestClient {

    @GetMapping(path = "/api/dataId/{attribute}")
    public int getIdByName(@PathVariable String attribute);

    @GetMapping(path = "/api/personalData/{id}")
    Data getData(@PathVariable(name = "id") int id);

    @GetMapping(path = "/api/personalDataList")
    List<Data> getListPersonalData();

   /* @GetMapping(path = "/dataType/{id}")
    DataType getDataType(@PathVariable int id);*/

}
