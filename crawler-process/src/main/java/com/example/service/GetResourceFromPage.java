package com.example.service;

import dto.RunCrawlerTransfer;
import exception.BadRequestRunCrawler;

public interface GetResourceFromPage {
    void parse(RunCrawlerTransfer runCrawlerTransfer) throws BadRequestRunCrawler;
}
