package com.learningjpa.jpaproject.controller;

import com.learningjpa.jpaproject.entity.Book;
import com.learningjpa.jpaproject.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable("id")int id)
    {
        return bookService.getBookById(id);
    }

     /*@RequestMapping(value = "/books", method = RequestMethod.POST) @ResponseBody is also same thing*/
    @PostMapping("/books")
    public Book addBook(@RequestBody Book book)
    {
        Book b = bookService.addBook(book);
        return b;
    }

    /*@RequestMapping(value = "/books/{bookId}", method = RequestMethod.DELETE) @ResponseBody is also same thing*/
    @DeleteMapping("/books/{bookId}")
    public void deleteBook(@PathVariable("bookId")int bookId)
    {
        bookService.deleteBook(bookId);
    }

    /*@RequestMapping(value = "/books/{bookId}", method = RequestMethod.PUT) @ResponseBody is also same thing*/
    @PutMapping("books/{bookId}")
    public Book updateBook(@PathVariable("bookId")int bookId, @RequestBody Book book)
    {
        Book b = bookService.updateBook(bookId, book);
        return b;
    }



}
