package com.example.service;

import dto.RunCrawlerTransfer;

public interface RunCrawlerConsumer {
    void consume(RunCrawlerTransfer runCrawlerTransfer);
}
