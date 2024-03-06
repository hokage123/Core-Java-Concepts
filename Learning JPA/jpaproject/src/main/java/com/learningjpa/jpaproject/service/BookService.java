package com.learningjpa.jpaproject.service;

import com.learningjpa.jpaproject.dao.BookRepository;
import com.learningjpa.jpaproject.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks()
    {
        List<Book> list = (List<Book>)bookRepository.findAll();
        return list;
    }

    public Book getBookById(int bookId)
    {
        Book book = null;

        try {
            bookRepository.findById(bookId);
        }
        catch (Exception ex)
        {}
        return book;
    }
}
