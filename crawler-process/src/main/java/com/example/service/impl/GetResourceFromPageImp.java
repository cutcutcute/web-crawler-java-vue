package com.example.service.impl;

import com.example.service.GetResourceFromPage;
import com.example.service.parser.GetResources;
import dto.RunCrawlerTransfer;
import exception.BadRequestRunCrawler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GetResourceFromPageImp implements GetResourceFromPage {

    private GetResources resourcesByLink;
    private GetResources resourcesByKeywords;

    public GetResourceFromPageImp(GetResources resourcesByLink, GetResources resourcesByKeywords){
        this.resourcesByLink=resourcesByLink;
        this.resourcesByKeywords=resourcesByKeywords;
    }

    /**
     * В зависимости от переданных значений будет осуществляться
     * запуск поисковой системы.
     *
     * Поле SEARCH_SYSTEM учитывается, только при попытке запуска поисковой системы
     * по ключевым словам
     *
     * В случае если и keywords и init_url != null будет осуществляться поиск по url
     * @param runCrawlerTransfer Трансфер из пакета commom-rabbitmq
     */
    @Override
    public void parse(RunCrawlerTransfer runCrawlerTransfer) throws BadRequestRunCrawler{

        if (runCrawlerTransfer.getInitialUrl() != null){
            log.info("Поиск по ссылке");
            resourcesByLink.get(runCrawlerTransfer);
        } else if (runCrawlerTransfer.getKeywords() != null) {
            log.info("Поиск по ключевым словам");
            resourcesByKeywords.get(runCrawlerTransfer);
        } else {
            log.warn("Ошибка при передаче параметров");
            throw new BadRequestRunCrawler("Ошибка при передаче параметров: \n" + runCrawlerTransfer);
        }
    }
}
