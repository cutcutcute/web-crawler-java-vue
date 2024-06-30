package com.example.configuration;


import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.example.model.RabbitQueue.RUN_CRAWLER_MESSAGE;
import static com.example.model.RabbitQueue.STATUS_CRAWLER_MESSAGE;

/**
 * В дальнейшем нужно вынести конфиг в отдельный модуль
 */
@Configuration
public class RabbitMqConfiguration {

    @Bean
    public MessageConverter jsonMessageConverter(){
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public Queue runCrawlerQueue(){
        return new Queue(RUN_CRAWLER_MESSAGE);
    }

    @Bean
    public Queue statusCrawlerQueue(){
        return new Queue(STATUS_CRAWLER_MESSAGE);
    }

}
