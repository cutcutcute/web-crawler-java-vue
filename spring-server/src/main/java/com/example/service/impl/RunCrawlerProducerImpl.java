package com.example.service.impl;


import com.example.service.RunCrawlerProducer;
import dto.RunCrawlerTransfer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RunCrawlerProducerImpl implements RunCrawlerProducer {
    private final RabbitTemplate rabbitTemplate;

    public RunCrawlerProducerImpl(RabbitTemplate rabbitTemplate){
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void produce(String rabbitQueue, RunCrawlerTransfer runCrawlerTransfer) {
        log.info("crawler is running");
        log.info("use params: " + runCrawlerTransfer.toString());
        rabbitTemplate.convertAndSend(rabbitQueue, runCrawlerTransfer);
    }
}
