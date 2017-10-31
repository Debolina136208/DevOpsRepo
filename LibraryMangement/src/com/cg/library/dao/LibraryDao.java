package com.cg.library.dao;

import java.util.List;

import com.cg.library.entities.BookInventory;
import com.cg.library.entities.BookRegistration;

public interface LibraryDao {

	public abstract BookInventory getBookById(String id);

	/*public abstract List<Librarian> getBookByTitle(String title);

	public abstract Long getBookCount();

	public abstract List<Librarian> getAuthorBooks(String author);
*/
	public abstract BookInventory deleteBookById(String bookId);
	
	public abstract BookInventory insertBook(BookInventory book);
	
	public abstract List<BookInventory> getAllBooks();
	
	public int validateUser(String userName, String password);

	BookRegistration validRegId(String inpRegId);

	//public abstract List<Librarian> getBooksInPriceRange(double low, double high);

}