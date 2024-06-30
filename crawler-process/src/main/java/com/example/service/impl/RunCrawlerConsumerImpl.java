package com.example.service.impl;

import com.example.service.GetResourceFromPage;
import com.example.service.ProduceCallbackMessage;
import com.example.service.RunCrawlerConsumer;
import dto.CallbackStatusCrawlerTransfer;
import dto.RunCrawlerTransfer;
import exception.BadRequestRunCrawler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import static com.example.model.RabbitQueue.RUN_CRAWLER_MESSAGE;
import static com.example.model.RabbitQueue.STATUS_CRAWLER_MESSAGE;

@Service
@Slf4j
public class RunCrawlerConsumerImpl implements RunCrawlerConsumer {

    private final GetResourceFromPage  getResourceFromPage;
    private final ProduceCallbackMessage  callbackProduceError;

    public RunCrawlerConsumerImpl(GetResourceFromPage getResourceFromPage,
                                  ProduceCallbackMessage callbackProduceError){
        this.getResourceFromPage=getResourceFromPage;
        this.callbackProduceError = callbackProduceError;
    }

    @Override
    @RabbitListener(queues = RUN_CRAWLER_MESSAGE)
    public void consume(RunCrawlerTransfer runCrawlerTransfer) {
        log.info("Пришло сообщение: " + runCrawlerTransfer);
        try {
            getResourceFromPage.parse(runCrawlerTransfer);
        } catch (BadRequestRunCrawler e){
            log.error(e.toString());

            callbackProduceError.produce(STATUS_CRAWLER_MESSAGE, new CallbackStatusCrawlerTransfer(false, e.toString()));
        }
    }
}
