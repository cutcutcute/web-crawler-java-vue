package com.example.service.impl;


import com.example.service.Crawler;
import com.example.service.RunCrawlerProducer;
import dto.RunCrawlerTransfer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class CrawlerFromWeb implements Crawler {



    @Override
    public void run(RunCrawlerTransfer runCrawlerTransfer) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> res = restTemplate.getForEntity(runCrawlerTransfer.getInitialUrl(), String.class);
        log.debug(res.toString());
        log.debug(res.getBody());
        System.out.println(res.getBody());
        System.out.println("Прошел");

    }
}
