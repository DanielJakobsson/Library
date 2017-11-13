package ui;

import model.*;
import utils.*;

import java.text.SimpleDateFormat;

public class MainLibrary {

	public static void main(String[] args) {
		
		

		BookCatalog bookCatalog = new BookCatalog(); 

		Book book1 = new Book(1, "Sagan om ringen", "Tolken", "4456", "brranchesss", 400);
		Book book2 = new Book(002, "Stiftelse trilogin", "Asimov", "4456", "bransh", 666);
		Dvd conan = new Dvd(33, "Conan barbarian", "Fantasy", "Robert Jordan", "8899", 180);
		Dvd firefly = new Dvd(45, "Serenity", "SciFi", "Joss Whedon", "4004", 480);
		
		book1.relocate("new branch");
		

		bookCatalog.addBook(book1);
		bookCatalog.addBook(book2);

		UI ui = new UI();
		ui.printHeader();

		ui.printBookCatalog(bookCatalog.getBookMap());
		
		try {
			
			Book foundBook = bookCatalog.findBook("Sagan om ringen");
			if(foundBook != null){
				System.out.println("We found " + foundBook.getTitle());
		}
		}
		catch (BookNotFoundException e){
			System.out.println("Book not found");
		}
		
		
			Customer customer = new Customer("Mr", "Henrik", "Lau", "Blåbärsstigen 5",
					"4465744", "mrLau@pagoda.dao", 86779559, GenderType.MALE );
			System.out.println(customer.getExpiryDate());
			System.out.println(customer.getMailingName());
			
			Loan loan1 = new Loan(1, customer, book1);
			System.out.println(loan1.getDueDate());
			System.out.println(loan1);
			
			LoanRegistry registry = new LoanRegistry();
			try {
			registry.addLoan(loan1);
			System.out.println("addLoan worked");
			}
			catch (LoanAlreadyExistException e) {
				System.out.println("addLoan failed");
			}
			try {
				registry.addLoan(loan1);
				System.out.println("addLoan worked");
				}
				catch (LoanAlreadyExistException e) {
					System.out.println("addLoan failed");
				}
			System.out.println(registry.isBookOnLoan(book1.getID()));
			loan1.endLoan();
			System.out.println(registry.isBookOnLoan(book1.getID()));
	}
}
