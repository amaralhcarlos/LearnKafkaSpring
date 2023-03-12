package dev.carlosamaral.KafkaExample.controller;

import dev.carlosamaral.KafkaExample.component.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/producer")
public class ProducerController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @PostMapping(value = "/message")
    public void postToKafka(){

        kafkaProducer.send("alou");

    }

}
