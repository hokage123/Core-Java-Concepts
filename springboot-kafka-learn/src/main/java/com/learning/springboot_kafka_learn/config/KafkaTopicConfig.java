package com.learning.springboot_kafka_learn.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    public NewTopic stringdummyTopic()
    {
        return TopicBuilder
                .name("stringdummy")
                .build();

    }
}
