package com.klm.exercises.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Bootstrap {

    public static void main(final String[] args) {
        SpringApplication.run(Bootstrap.class, args);
    }
    
    @Bean
    public RestTemplate getRestTemplate() {
       return new RestTemplate();
    }

}
