package com.virus.KafkaProducer.controller.service;

import com.virus.KafkaProducer.contants.KafkaConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;


    public void setUpdateLocation(String msg) {
        this.kafkaTemplate.send(KafkaConstant.TOPIC_NAME, msg);
    }

}
