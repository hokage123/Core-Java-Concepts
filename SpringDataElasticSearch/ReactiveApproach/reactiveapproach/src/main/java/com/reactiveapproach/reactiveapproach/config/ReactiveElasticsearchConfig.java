package com.reactiveapproach.reactiveapproach.config;

import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.elc.ReactiveElasticsearchConfiguration;

public class ReactiveElasticsearchConfig extends ReactiveElasticsearchConfiguration {

    @Override
    public ClientConfiguration clientConfiguration()
    {
        return ClientConfiguration.builder()
                .connectedTo("localhost:9200")
                .build();
    }
}
