package model;

import java.util.Date;
import java.util.GregorianCalendar;

import utils.LoanStatus;

public class Loan {
	
	private int loanID;
	private Customer customer;
	private Book book;
	private Date startDate;
	private Date dueDate;
	private Date returnDate;
	private LoanStatus status;

	public Loan(int loanID,Customer customer, Book book ) {
		super();
		this.loanID = loanID;
		this.customer = customer;
		this.book = book;
		startDate = new Date();
		
		GregorianCalendar gCal = new GregorianCalendar();
		gCal.add(GregorianCalendar.DAY_OF_MONTH, 14);
		this.dueDate = gCal.getTime();
		
		status = LoanStatus.CURRENT;
	}

	@Override
	public String toString() {
		return "Loan [id=" + loanID + ", customer=" + customer.getMailingName() + ", book=" + book.getTitle() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + loanID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loan other = (Loan) obj;
		if (loanID != other.loanID)
			return false;
		return true;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Book getBook() {
		return book;
	}

	public Date getDueDate() {
		return dueDate;
	}
	
	public LoanStatus getStatus() {
		return status;
	}
	
	public void endLoan() {
		returnDate = new Date();
		status = LoanStatus.HISTORIC;
	}
	
	
}
