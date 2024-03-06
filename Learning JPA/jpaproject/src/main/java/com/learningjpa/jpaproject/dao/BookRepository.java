package com.learningjpa.jpaproject.dao;

import com.learningjpa.jpaproject.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {
}
