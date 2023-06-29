package com.university.college.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class CollegeService {

    private WebClient webClient;

    public CollegeService(WebClient webClient) {
        this.webClient = webClient;
    }

   /* public String getSomeData(){
        this.webClient.get().uri("https://reqres.in/api/users/2").accept(MediaType.APPLICATION_JSON).exchangeToMono()
    }*/
}
