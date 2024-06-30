package com.example.service.parser;

import dto.RunCrawlerTransfer;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ResourcesByLink implements GetResources {


    @Override
    public void get(RunCrawlerTransfer runCrawlerTransfer) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> res = restTemplate.getForEntity(runCrawlerTransfer.getInitialUrl(), String.class);
        System.out.println(res.getBody());
    }
}
