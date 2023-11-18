package com.springrest.springrest.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.springrest.springrest.entities.Book;
import com.springrest.springrest.services.BookService;
import java.util.List;

@RestController
public class MyController {

    @Autowired
	private BookService bookService;
    
    @GetMapping("/home")
    public String home() {
        return "This is home";
    }

    // Get all books
    @GetMapping("/books")
    public List<Book> getBooks() {
        return this.bookService.getBooks();
    }
    //get single book
    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable String id) {
        return this.bookService.getBook(Long.parseLong(id));
    }
    //create book
    @PostMapping("/books")
    public Book addBook(@RequestBody Book book) {
        return this.bookService.addBook(book);
    }
}
