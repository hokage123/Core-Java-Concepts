package com.learning.springboot_kafka_learn.controller;

import com.learning.springboot_kafka_learn.kafka.JsonKafkaProducer;
import com.learning.springboot_kafka_learn.payload.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

    private JsonKafkaProducer kafkaProducer;

    public JsonMessageController(JsonKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user)
    {
        kafkaProducer.sendMessage(user);
        return ResponseEntity.ok("JSON message sent to kafka topic");

    }
}
