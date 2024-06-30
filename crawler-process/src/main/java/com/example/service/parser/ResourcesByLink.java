package com.example.service.parser;

import dto.RunCrawlerTransfer;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ResourcesByLink implements GetResources {


    @Override
    public void get(RunCrawlerTransfer runCrawlerTransfer) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> res = restTemplate.getForEntity(runCrawlerTransfer.getInitialUrl(), String.class);
            if (res.getBody() != null) {
                Document document = Jsoup.parse(res.getBody());
                List<String> links = getUrls(document);
                System.out.println(runCrawlerTransfer.getKeywords().toString());
                getAllHTags(document);
                System.out.println(links);
            }
        } catch (Exception e){
            e.printStackTrace();
            //Тут может произойти исключение при котором сообщение не обработается
            //Дальнейшие действия -> Сохранение ссылки в бд со статусом не обработано
        }


    }
}
