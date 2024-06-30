package com.example.service;

import dto.CallbackTransfer;

public interface ProduceCallbackMessage {
    void produce(String rabbitQueue, CallbackTransfer callbackTransfer);
}
