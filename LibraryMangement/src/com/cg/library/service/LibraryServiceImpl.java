package com.cg.library.service;

import java.util.List;

import com.cg.library.dao.LibraryDao;
import com.cg.library.dao.LibraryDaoImpl;
import com.cg.library.entities.BookInventory;

public class LibraryServiceImpl implements LibraryService {

	private LibraryDao dao;

	public LibraryServiceImpl() {
		dao = new LibraryDaoImpl();
	}

	@Override
	public BookInventory getBookById(String id) {
		return dao.getBookById(id);
	}
/*
	@Override
	public List<Librarian> getBookByTitle(String title) {
		return dao.getBookByTitle(title);
	}

	@Override
	public Long getBookCount() {
		return dao.getBookCount();
	}

	@Override
	public List<Librarian> getAuthorBooks(String author) {
		return dao.getAuthorBooks(author);
	}
*/
	@Override
	public List<BookInventory> getAllBooks() {
		return dao.getAllBooks();
	}
	
	@Override
	public int validateUser(String userName, String password) {
		return dao.validateUser(userName, password);
	}
/*	
	@Override
	public List<Librarian> getBooksInPriceRange(double low, double high){
		return dao.getBooksInPriceRange(low, high);
	}*/

	@Override
	public BookInventory insertBook(BookInventory book) {
		return dao.insertBook(book);
	}

	@Override
	public BookInventory deleteBookById(String bookId) {
		return dao.deleteBookById(bookId);
	}
}
