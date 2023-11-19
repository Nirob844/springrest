package com.springrest.springrest.services;

import com.springrest.springrest.entities.Book;
import java.util.List;

public interface BookService {
  public List<Book> getBooks();
  public Book getBook(long id);
  public Book addBook(Book book);
  public Book updateBook(Book book);
  public void deleteBook(long id);
}
