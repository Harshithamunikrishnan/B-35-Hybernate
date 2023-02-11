package org.tnsindia.service;

import java.util.List;

import org.tnsindia.entities.Book;

public interface BookService {
	
		//abstract method
		Book getBookById(int id);
		List<Book>getAllBooks();
		List<Book>getAuthorBooks(String author);
		Long getBooksCount();
		List<Book>getBookByPrice(int low,int high);

}