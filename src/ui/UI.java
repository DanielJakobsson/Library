package ui;
import java.util.HashMap;

import model.Book;

public class UI {

	public void printBook(Book book) {

		System.out.println(fixLengthString(book.getID(), 6) + " " + fixLengthString(book.getTitle(), 20) + " " + 
				fixLengthString(book.getAuthor(), 20) + " " + book.getIsbn());
	}

	public void printHeader() {
		System.out.println("BookID       title         author               isbn");
	}

	private String fixLengthString(String start, int length) {
		if(start.length() >= length) {
			return start.substring(0, length);
		}
		else {
			while(start.length() < length) {
				start+= " ";
			}
			return start;
		}
	}
	//overlading
	private String fixLengthString(int start, int length) {
		String startString = String.valueOf(start);
		return fixLengthString(startString, length);
	}
	
	public void printBookCatalog(HashMap<Integer, Book> bookCatalog) {
		for(Book nextBook : bookCatalog.values()) {
				printBook(nextBook);
		}
	}
}