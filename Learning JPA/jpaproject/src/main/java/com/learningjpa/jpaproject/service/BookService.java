package com.learningjpa.jpaproject.service;

import com.learningjpa.jpaproject.dao.BookRepository;
import com.learningjpa.jpaproject.entity.Book;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        List<Book> list = (List<Book>) bookRepository.findAll();
        return list;
    }

    public Book getBookById(int bookId) {
        Book book1 = null;

        try {
            book1 = bookRepository.findById(bookId).get();
        } catch (Exception ex) {
        }
        return book1;
    }

    public Book addBook(Book book) {
        Book book1 = null;
        try {
            book1 = bookRepository.save(book);
        } catch (Exception ex) {
        }
        return book1;
    }

    public Book deleteBook(int bookId) {
        Book book = null;

        try {
            book = getBookById(bookId);
            bookRepository.delete(book);
        } catch (Exception ex) {
        }
        return book;
    }


    public Book updateBook(int bookId, Book book) {
        Book book1 = null;

        try {
            book1 = bookRepository.findById(bookId).get();
            book1.setAuthor(book.getAuthor());
            book1.setTitle(book.getTitle());
            bookRepository.save(book1);
        } catch (Exception ex) {
        }
        return book1;

    }
}
