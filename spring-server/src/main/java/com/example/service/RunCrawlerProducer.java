package com.example.service;


import dto.RunCrawlerTransfer;

public interface RunCrawlerProducer {
    void produce(String rabbitQueue, RunCrawlerTransfer runCrawlerTransfer);
}
