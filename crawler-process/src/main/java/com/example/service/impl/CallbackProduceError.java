package com.example.service.impl;

import com.example.service.ProduceCallbackMessage;
import dto.CallbackTransfer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CallbackProduceError implements ProduceCallbackMessage {

    private RabbitTemplate rabbitTemplate;

    @Override
    public void produce(String rabbitQueue, CallbackTransfer callbackTransfer) {
        rabbitTemplate.convertAndSend(rabbitQueue, callbackTransfer);
        log.warn("Сообщение об ошибке отправлено на сервер");
    }
}
