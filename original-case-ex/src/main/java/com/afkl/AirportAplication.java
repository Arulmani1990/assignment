package com.afkl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AirportAplication {

    public static void main(final String[] args) {
        SpringApplication.run(AirportAplication.class, args);
    }
    
    @Bean
    public RestTemplate getRestTemplate() {
       return new RestTemplate();
    }

}
