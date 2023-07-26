package priam.datarequest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import priam.datarequest.dto.DataRequestRequestDTO;
import priam.datarequest.services.DataRequestService;

@SpringBootApplication
@Configuration
@EnableFeignClients
public class DataRequestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataRequestApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(DataRequestService dataRequestService) {
        return args -> {
            //dataRequestService.save(new DataRequestRequestDTO(1,"error in my age", "20", "Rectification",1,1));
            //dataRequestService.save(new DataRequestRequestDTO(2,"error in my name", "anais", "Rectification",2,1));
        };
    }
}

