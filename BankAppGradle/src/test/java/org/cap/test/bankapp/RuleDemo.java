package org.cap.test.bankapp;

import static org.junit.Assert.*;

import org.cap.dto.Customer;
import org.cap.exception.InvalidInitialAmountException;
import org.cap.service.AcccountService;
import org.cap.service.AccountServiceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RuleDemo {

	
	private AcccountService accountService;
	@Before
	public void initMethod(){
		accountService=new AccountServiceImpl();
	}

	/*@Rule
	public ExpectedException thrown=ExpectedException.none();
	*/
	@Test(expected=IllegalArgumentException.class)
	public void test() throws InvalidInitialAmountException {
		//thrown.expect(IllegalArgumentException.class);
		/*thrown.expect(InvalidInitialAmountException.class);
		thrown.expectMessage("balance");
		*/
		/*Customer customer=new Customer();
		customer.setCustName("Tom");
		*/
		accountService.addAccount(null, 1000);
		
	}
	
	

}
