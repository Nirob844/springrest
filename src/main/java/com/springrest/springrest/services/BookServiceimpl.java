package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Book;

@Service
public class BookServiceimpl implements BookService {

	List<Book> list;
	
	
	public BookServiceimpl() {
		list = new ArrayList<>();
		list.add(new Book(1,"book1","this is book 1"));
		list.add(new Book(2,"book2","this is book 2"));
		list.add(new Book(3,"book3","this is book 3"));
	}


	@Override
	public List<Book> getBooks() {
		return list;
	}


	@Override
	public Book getBook(long id) {
		Book b = null;
		for(Book book:list)
		{
			if(book.getId()==id)
			{
				b=book;
				break;
			}
		}
		return b;
	}


	@Override
	public Book addBook(Book book) {
		list.add(book);
		return book;
	}

}
