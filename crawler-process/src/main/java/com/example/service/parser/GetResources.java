package com.example.service.parser;

import dto.RunCrawlerTransfer;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.List;
import java.util.stream.Collectors;

public interface GetResources {
    void get(RunCrawlerTransfer runCrawlerTransfer);

    default List<String> getUrls(Document document){
        //Собирать все урлы со страницы
        Elements elements =  document.select("a");
        return formatLinks(elements.stream().map(el ->  el.attr("href")).collect(Collectors.toList()));
    }

    default void getAllKeywords(){
        //Сбор всех ключевых слов
    }

    default void getAllHTags(Document document){
        // Сбор всех H тегов
        System.out.println(document.select("h*"));
    }

    default List<String> formatLinks(List<String> links){
        return links.stream().filter(link -> !link.equals("/"))
                .filter(link -> !link.startsWith("/#"))
                .filter(link -> !link.equals("#"))
                .filter(link -> !link.toLowerCase().contains("facebook"))
                .filter(link -> !link.toLowerCase().contains("instagram"))
                .filter(link -> !link.toLowerCase().contains("vk.com"))
                .filter(link -> !link.toLowerCase().contains("t.me"))
                .distinct()
                .collect(Collectors.toList());
    }
}
