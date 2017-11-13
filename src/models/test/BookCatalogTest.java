package models.test;

import static org.junit.jupiter.api.Assertions.*;

import model.Book;
import model.BookCatalog;

import org.junit.jupiter.api.Test;

import model.BookNotFoundException;

class BookCatalogTest {
	
	private BookCatalog bc;
	private Book book1;
	
	private BookCatalogTest() {
		bc = new BookCatalog();
		book1 = new Book(1, "Sagan om ringen", "","","",0);
		bc.addBook(book1);
	}
	

	@Test
	public void testAddABook() {
		
		int initialNumber = bc.getNumberOfBook();
		System.out.println(initialNumber);
		Book book = new Book(1,"","","","",0);
		bc.addBook(book);
		
		assertTrue(initialNumber == bc.getNumberOfBook() -1;)
	}
	
	@Test
	public void testFindBook() {
		
		try {
			Book foundBook = bc.findBook("Sagan om ringen");
		}
		catch (BookNotFoundException e) {
			fail("Book not found");
		}
	}
	
public void testFindBookIgnoreCase() {
		
		try {
			Book foundBook = bc.findBook("sagan om ringen");
		}
		catch (BookNotFoundException e) {
			fail("Book not found");
		}
	}

public void testFindBookWithExtraSpaces() {
	
	try {
		Book foundBook = bc.findBook("   sagan om ringen  ");
	}
	catch (BookNotFoundException e) {
		fail("Book not found");
	}
}
	
	@Test(expected = BookNotFoundException.class)
	public void testFindBookThatDoesntExist() throws BookNotFoundException{
	
		Book foundBook = bc.findBook("Sagan om ringen");
	}
}





