package com.reactiveapproach.reactiveapproach.entities;


import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.Instant;

@Document(indexName = "employees")
public class Employee implements Persistable<Long> {
    @Id
    private Long id;
    private String lastName;
    private String firstName;

    private Long salary;

    @CreatedDate
    @Field(type = FieldType.Date, format = DateFormat.basic_date_time)
    private Instant date_Of_Joining;

    public Long getId() {
        return id;
    }

    @Override
    public boolean isNew() {
        return id == null || (date_Of_Joining == null);
    }
}
