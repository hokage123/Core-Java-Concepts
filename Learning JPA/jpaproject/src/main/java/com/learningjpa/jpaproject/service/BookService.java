package com.learningjpa.jpaproject.service;

import com.learningjpa.jpaproject.dao.BookRepository;
import com.learningjpa.jpaproject.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

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

    public Book addBook(Book book)
    {
        Book book1 = null;
        try
        {
           book1 = bookRepository.save(book);
        }catch (Exception ex)
        {
        }
        return book1;
    }

    public Book deleteBook(int bookId)
    {
        Book book = null;

        try
        {
            book = getBookById(bookId);
            bookRepository.delete(book);
        }catch (Exception ex)
        {
        }
        return book;
    }

    public Book updateBook(int bookId, Book book)
    {
        Book book1 = null;

        try
        {
            book1 = bookRepository.save(book);
        }catch (Exception ex)
        {
        }
        return book1;

    }
}
