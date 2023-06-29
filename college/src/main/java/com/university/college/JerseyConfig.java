package com.university.college;

import com.university.college.controller.CollegeController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig(){
        register(CollegeController.class);
    }

    @Bean
    public WebClient webClient(){
        return WebClient.create();
    }
}
