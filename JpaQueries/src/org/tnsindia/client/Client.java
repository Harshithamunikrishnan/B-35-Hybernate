package org.tnsindia.client;

import org.tnsindia.service.BookService;
import org.tnsindia.service.BookServiceImpl;

//driver class
public class Client {

	public static void main(String[] args) {
		BookService service=new BookServiceImpl();
		
		System.out.println("Total No.of Books: "+service.getBooksCount());
		
		System.out.println("The Book with ID:"+" "+service.getBookById(12));
		
		System.out.println("The Book with specific author: "+service.getAuthorBooks("Harshitha M"));
		
		System.out.println("The price between 2000 to 2400: "+service.getBookByPrice(2000, 2400));
		
		System.out.println("All books: "+service.getAllBooks());
	}

}