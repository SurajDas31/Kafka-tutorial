package com.virus.KafkaProducer.controller;

import com.virus.KafkaProducer.controller.service.KafkaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;


@RestController
public class KafkaController {

    Logger log = LoggerFactory.getLogger(KafkaController.class);

    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/")
    public ResponseEntity<?> updateLocation(){

        this.kafkaService.setUpdateLocation("(" + Math.random() * 100 + "," + Math.random() * 100 + ")");
        log.info("Suraj");
        return new ResponseEntity<>(new HashMap<>().put("message", "Location Updated"), HttpStatus.OK);
    }

}
