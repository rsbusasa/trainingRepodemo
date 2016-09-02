package org.cap.test.bankapp;

import static org.junit.Assert.*;

import org.cap.dto.Account;
import org.cap.dto.Address;
import org.cap.dto.Customer;
import org.cap.exception.InvalidInitialAmountException;
import org.cap.service.AcccountService;
import org.cap.service.AccountServiceImpl;
import org.cap.util.AccountUtil;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class BankAppTestCase {

	private AcccountService accService;
	
	/*public  BankAppTestCase() {
		accService=new AccountServiceImpl();
	}
	*/
	
	@BeforeClass
	public static void setUp(){
		System.out.println("BeforeClass Method");
	}
	
	
	@AfterClass
	public static void tearDown(){
		System.out.println("AfterClass Method");
	}
	
	@Before
	public void beforeMethod(){
		System.out.println("Before Method");
		accService=new AccountServiceImpl();
	}
	
	@After
	public void afterMethod(){
		System.out.println("After Method");
		//accService=new AccountServiceImpl();
	}
	
	
	@Test
	@Category(GoodTestCategory.class)
	public void test() {
		//fail("Not yet implemented");
	}

	
	@Test
	@Category(GoodTestCategory.class)
	public void test_Addnumbers(){
		System.out.println("test_Addnumbers");
		assertEquals(9, accService.addNumbers(3, 6));
	}
	
	@Category(BadTestCategory.class)
	@Test(expected=IllegalArgumentException.class)
	public void when_addAccount_with_null_customer_exception_thrown() throws InvalidInitialAmountException{
		Customer customer=null;
		double amount=1000;
		accService.addAccount(customer, amount);
	
	}
	
	//@Ignore
	@Category(GoodTestCategory.class)
	@Test(expected=NullPointerException.class)
	public void invalid_initialAmount_exceptionTest() throws InvalidInitialAmountException{
		Customer customer=new Customer();
		customer.setCustName("Tom");
		customer.setCustAddress(new Address());
		
		accService.addAccount(customer, 1000);
	}
	
	
	
	
	
	
	
	
}
