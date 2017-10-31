package com.cg.library.client;

import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

import com.cg.library.entities.BookInventory;
import com.cg.library.service.LibraryService;
import com.cg.library.service.LibraryServiceImpl;

public class Client {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {

		LibraryService service = new LibraryServiceImpl();


		Scanner s0 = new Scanner(System.in);
		System.out.println("Username - ");
		String userName = s0.next();
		System.out.println("Password - ");
		String password = s0.next();
		int status = service.validateUser(userName, password);

		if(status==1)//librarian************************
		{
			System.out.println("Welcome "+userName+" You are librarian");
			System.out.println("\n1.Display ALL Books\n2.Add a book\n3.Delete a book"
					+ "\n4.Issue request\n5.Return Book");
			Scanner sa = new Scanner(System.in);
			System.out.println("Please select your operation - ");
			int choice = sa.nextInt();

			switch(choice)
			{
			case 1 : 
				System.out.println("\n\n************Book List*************\n\n");
				for(BookInventory bookInventory:service.getAllBooks()) {
					System.out.println(bookInventory);
				}
				break;
			case 2 :
				BookInventory bookNew = new BookInventory();
				System.out.println("Enter Details \n");
				System.out.println("Enter Book Id ");
				Scanner sb = new Scanner(System.in);
				String bookId = sb.nextLine();
				bookNew.setBookId(bookId);
				System.out.println("Enter Book Name ");
				String bookName = sb.nextLine();
				bookNew.setBookName(bookName);
				System.out.println("Enter Book Author 1 ");
				String author1 = sb.nextLine();
				bookNew.setAuthor1(author1);
				System.out.println("Enter Book Author 2 ");
				String author2 = sb.nextLine();
				bookNew.setAuthor2(author2);
				System.out.println("Enter Book Publisher ");
				String publisher = sb.nextLine();
				bookNew.setPublisher(publisher);
				System.out.println("Enter Year of Publication ");
				String yearOfPublication=sb.nextLine();
				bookNew.setYearOfPublication(yearOfPublication);

				bookNew = service.insertBook(bookNew);

				System.out.println("Book inserted with Id "+bookNew.getBookId());
				break;
			case 3 : 
				Scanner sc = new Scanner(System.in);
				System.out.println("\nEnter Book Id to be deleted - ");
				String bookIdDelete = sc.next();
				
				BookInventory bookDeleted = service.deleteBookById(bookIdDelete);
				
				System.out.println("Book with Id "+bookDeleted.getBookId()+" deleted successfully");
				
				break;
			case 4 :
				
		
			default : System.out.println("You r in defau;t section");	 

			case 6:
				System.out.println("Enter Registration Id");
				String regId=sa.next();
		}
		}
		else if(status==0)//Student******************
		{
			System.out.println("Welcome "+userName+" You are student");

			System.out.println("\n1.Display ALL Books\n2.Place a request");
			Scanner sa = new Scanner(System.in);
			System.out.println("Please select your operation - ");
			int choice = sa.nextInt();
			switch(choice)
			{
			case 1 : 
				System.out.println("\n\n************Book List*************\n\n");
				for(BookInventory bookInventory:service.getAllBooks()) {
					System.out.println(bookInventory);
				}
			case 2 :
				System.out.println();

			}


		}
		else
		{
			System.out.println("Not a valid User");
		}












	}
}
