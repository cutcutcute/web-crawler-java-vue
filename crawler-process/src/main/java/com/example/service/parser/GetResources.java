package com.example.service.parser;

import dto.RunCrawlerTransfer;

public interface GetResources {
    void get(RunCrawlerTransfer runCrawlerTransfer);

    default void getUrls(){
        //Собирать все урлы со страницы
    }

    default void getAllKeywords(){
        //Сбор всех ключевых слов
    }

    default void getAllHTags(){
        // Сбор всех H тегов
    }
}
