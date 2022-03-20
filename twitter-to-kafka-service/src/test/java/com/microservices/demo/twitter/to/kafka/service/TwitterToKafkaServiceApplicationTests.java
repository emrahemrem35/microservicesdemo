package com.microservices.demo.twitter.to.kafka.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {com.microservices.demo.twitter.to.kafka.service.TwitterToKafkaServiceApplication.class})
public class TwitterToKafkaServiceApplicationTests {

    @Test
    public void contextLoad() {
        System.out.println("App Test Starting...");
    }
}
