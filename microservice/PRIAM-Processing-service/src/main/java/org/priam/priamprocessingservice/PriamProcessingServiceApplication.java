package org.priam.priamprocessingservice;

import org.priam.priamprocessingservice.repositories.DataUsageRepository;
import org.priam.priamprocessingservice.repositories.ProcessingRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableFeignClients
public class PriamProcessingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PriamProcessingServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner start(ProcessingRepository processingRepository, DataUsageRepository dataUsageRepository) {
        return args -> {

        };

    }
}
