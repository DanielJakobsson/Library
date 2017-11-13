package model;

public class Book extends Material {
	
	private String author;
	private String isbn;
	private int pages;
	
	public Book(int bookID, String title, String author, String isbn, String branch, int pages) {
		super(bookID, title, branch);
	
		this.author = author;
		this.isbn = isbn;
		this.pages = pages;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void sendForRepair() {
		System.out.println("Item sent for repair");
	}
	
	public int getLoanPeriod() {
		return 21;
	}
}
