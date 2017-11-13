package models.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Book;

class BookTest {

	@Test
	void test2EqualBooks() {
		Book book1 = new Book(100, "", "", "", "", 1);
		Book book2 = new Book(100, "", "", "", "", 1);
		
		assertTrue(book1.equals(book2));
		
	}
	
	@Test
	void test2NonEqualBooks() {
		Book book1 = new Book(100, "", "", "", "", 1);
		Book book2 = new Book(100, "", "", "", "", 1);
		
		assertFalse(book1.equals(book2));
	}
}
