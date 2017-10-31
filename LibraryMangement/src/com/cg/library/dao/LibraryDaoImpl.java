package com.cg.library.dao;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.library.entities.BookInventory;
import com.cg.library.entities.BookRegistration;
import com.cg.library.entities.BookTransaction;
import com.cg.library.entities.Users;

public class LibraryDaoImpl implements LibraryDao {

	private EntityManager entityManager;

	public LibraryDaoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}


	@Override
	public BookInventory getBookById(String id) {
		BookInventory book = entityManager.find(BookInventory.class, id);
		return book;
	}

	/*
	@Override
	public List<Librarian> getBookByTitle(String title) {
		String qStr = "SELECT book FROM Book book WHERE book.title LIKE :ptitle";
		TypedQuery<Librarian> query = entityManager.createQuery(qStr, Librarian.class);
		query.setParameter("ptitle", "%"+title+"%");
		return query.getResultList();
	}


	@Override
	public Long getBookCount() {
		String qStr = "SELECT COUNT(book.id) FROM Book book";
		TypedQuery<Long> query = entityManager.createQuery(qStr,
				Long.class);
		Long count = query.getSingleResult();
		return count;
	}


	@Override
	public List<Librarian> getAuthorBooks(String author) {
		String qStr = "SELECT book FROM Book book WHERE book.author=:pAuthor";
		TypedQuery<Librarian> query = entityManager.createQuery(qStr, Librarian.class);
		query.setParameter("pAuthor", author);
		List<Librarian> bookList = query.getResultList();
		return bookList;
	}
	 */

	@Override
	public List<BookInventory> getAllBooks() {
		Query query = entityManager.createNamedQuery("getAllBooks");
		@SuppressWarnings("unchecked")
		List<BookInventory> bookList = query.getResultList();
		return bookList;
	}


	@Override
	public int validateUser(String userName, String password){

		String qStr = "SELECT u FROM Users u WHERE u.userName='"+userName+"' AND u.password='"+password+"'";
		TypedQuery<Users> query = entityManager.createQuery(qStr, Users.class);
		Users user = query.getSingleResult();
		if(user.isLibrarian().equals("true"))
		{
			return 1;
		}
		else if(user.isLibrarian().equals("false"))
		{	
			return 0;
		}
		else
			return -1;
	}


	@Override
	public BookInventory insertBook(BookInventory book) {
		entityManager.getTransaction().begin();
		entityManager.persist(book);
		entityManager.getTransaction().commit();
		return book;
	}

	@Override
	public BookRegistration validRegId(String inpRegId) 
	{
		BookRegistration reg = entityManager.find(BookRegistration.class, inpRegId);
		return reg;
	}


	@Override
	public BookInventory deleteBookById(String bookId) {
		BookInventory book = entityManager.find(BookInventory.class, bookId);
		entityManager.remove(book);
		return book;
	}
	
	public BookInventory updateBookQuan(String bookId,int updateBy)
	{
		BookInventory inv=this.getBookById(bookId);
		inv.setNoOfBooks(inv.getNoOfBooks()+updateBy);
		entityManager.getTransaction().begin();
		entityManager.merge(inv);
		entityManager.getTransaction().commit();
		return inv;
	}
	
	public int returnBook(String inpRegId)
	{
		int fine=0;
		BookRegistration reg=this.validRegId(inpRegId);
		LocalDate issue=reg.getRegistrationDate().toLocalDate();
		LocalDate today=LocalDate.now();
		LocalDate expReturn=issue.plusDays(15);
		int chk=Period.between(expReturn, today).getDays();
		if(chk>0)
			fine=chk*10;     //fine is 10rs per day*************
		BookTransaction tran;
		String qStr = "SELECT t FROM BookTransaction t WHERE t.registrationId='"+inpRegId+"'";
		TypedQuery<BookTransaction> query = entityManager.createQuery(qStr, BookTransaction.class);
		tran = query.getSingleResult();
		tran.setReturnDate(java.sql.Date.valueOf(today));
		tran.setFine(fine);
		entityManager.getTransaction().begin();
		entityManager.merge(tran);
		entityManager.getTransaction().commit();
		
		this.updateBookQuan(reg.getBookId(), 1);
		return fine;
	}
	/*@Override
	public List<Librarian> getBooksInPriceRange(double low,double high) {
		String qStr = "SELECT book FROM Book book WHERE book.price between :low and :high";
		TypedQuery<Librarian> query = entityManager.createQuery(qStr, Librarian.class);
		query.setParameter("low", low);
		query.setParameter("high", high);
		List<Librarian> bookList = query.getResultList();
		return bookList;
	}*/

}
