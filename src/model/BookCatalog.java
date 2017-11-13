package model;

import java.util.HashMap;

public class BookCatalog {
	
	private HashMap<Integer, Book> bookMap;
	
	public BookCatalog() {
		bookMap = new HashMap<Integer, Book>();
	}
	
	public HashMap<Integer, Book> getBookMap() {
		return bookMap;
	}
	
	public int getNumberOfBook() {
		return bookMap.size();
	}
	
	public void addBook(Book newBook) {
		bookMap.put(newBook.getID(), newBook);
	}
	
	public Book findBook(String title) throws BookNotFoundException {
		title = title.trim();
		for(Book nextBook : bookMap.values()) {
			if(nextBook.getTitle().equalsIgnoreCase(title)) {
				return nextBook;
			}
		}
		throw new BookNotFoundException();
	}
	
}
