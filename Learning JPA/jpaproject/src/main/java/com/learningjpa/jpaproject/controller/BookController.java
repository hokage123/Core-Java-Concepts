package com.learningjpa.jpaproject.controller;

import com.learningjpa.jpaproject.entity.Book;
import com.learningjpa.jpaproject.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getAllBooks()
    {
        List<Book> booksList = bookService.getAllBooks();
        return booksList;
    }

    

}
