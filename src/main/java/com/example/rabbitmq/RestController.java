package com.example.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

@org.springframework.web.bind.annotation.RestController
public class RestController {


    @Resource
    private RabbitTemplate rabbitTemplate;

    @GetMapping("/")
    public void hello() {
        rabbitTemplate.convertAndSend("testQueue", "Aaaaaaaaaaaaa");
    }
}
