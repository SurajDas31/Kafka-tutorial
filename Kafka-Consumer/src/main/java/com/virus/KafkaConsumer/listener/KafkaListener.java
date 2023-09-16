package com.virus.KafkaConsumer.listener;

import com.virus.KafkaConsumer.constants.KafkaConstant;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaListener {



    @org.springframework.kafka.annotation.KafkaListener(topics = KafkaConstant.TOPIC_NAME  ,groupId = KafkaConstant.GROUP_ID)
    public void locationListenre(String result){
        System.out.println(result);
    }
}
