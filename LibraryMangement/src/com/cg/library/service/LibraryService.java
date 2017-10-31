package com.cg.library.service;

import java.util.List;

import com.cg.library.entities.BookInventory;

public interface LibraryService {

	public abstract  BookInventory getBookById(int id);

	//public abstract List<Librarian> getBookByTitle(String title);

	//public abstract Long getBookCount();

	//public abstract List<Librarian> getAuthorBooks(String author);
	public abstract BookInventory deleteBookById(String bookIdDelete);
	
	public abstract BookInventory insertBook(BookInventory book);
	
	public abstract List<BookInventory> getAllBooks();
	
	public int validateUser(String userName, String password);

	//public abstract List<Librarian> getBooksInPriceRange(double low, double high);

}