package models.test;
import model.*;
import utils.GenderType;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.GregorianCalendar;

import org.junit.jupiter.api.Test;

class LoanTest {

	@Test
	public void testDueDate() {
		
		Book book = new Book(0, "", "", "", "", 0);
		Customer customer = new Customer("","","","","","" ,0, GenderType.MALE);
		
		Loan loan = new Loan(0,customer,book);
		
		GregorianCalendar gCalExpected = new GregorianCalendar();
		gCalExpected.add(GregorianCalendar.DAY_OF_WEEK, 14);
		
		GregorianCalendar gCalActual = new GregorianCalendar();
		gCalActual.setTime(loan.getDueDate());
		assertEquals(gCalExpected.get(GregorianCalendar.YEAR), gCalActual.get(GregorianCalendar.YEAR));
		assertEquals(gCalExpected.get(GregorianCalendar.MONTH), gCalActual.get(GregorianCalendar.MONTH));
		assertEquals(gCalExpected.get(GregorianCalendar.DAY_OF_MONTH), gCalActual.get(GregorianCalendar.DAY_OF_MONTH));
	}

}
