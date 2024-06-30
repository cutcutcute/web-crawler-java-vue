package com.example.controller;



import com.example.service.Crawler;
import com.example.service.RunCrawlerProducer;
import dto.RunCrawlerTransfer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.model.RabbitQueue.RUN_CRAWLER_MESSAGE;

@RestController
@RequestMapping(path = "/crawler")
public class RunCrawler {

    private final Crawler crawler;
    private final RunCrawlerProducer runCrawlerProducer;

    public RunCrawler(Crawler crawler,
                      RunCrawlerProducer runCrawlerProducer){
        this.crawler = crawler;
        this.runCrawlerProducer=runCrawlerProducer;
    }

    @PostMapping(value = "/run")
    public void runCrawler(@RequestBody RunCrawlerTransfer runCrawlerTransfer){
        //crawler.run(runCrawlerTransfer);
        runCrawlerProducer.produce(RUN_CRAWLER_MESSAGE, runCrawlerTransfer);
    }


}
