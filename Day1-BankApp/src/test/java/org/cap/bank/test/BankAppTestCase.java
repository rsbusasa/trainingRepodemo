package org.cap.bank.test;

import static org.junit.Assert.*;

import org.cap.dao.AccountDao;
import org.cap.dto.Account;
import org.cap.dto.Customer;
import org.cap.exception.InvalidInitialAmountException;
import org.cap.service.AcccountService;
import org.cap.service.AccountServiceImpl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class BankAppTestCase {

	@Mock
	private AccountDao accountDao;
	private AcccountService acccountService;
	
	@BeforeClass
	public static  void setUpMethod(){
		System.out.println("setUpMethod");
	}
	
	@AfterClass
	public  static void tearDownMethod(){
		System.out.println("tearDownMethod");
	}
	
	@Before
	public void beforeTestCase(){
		System.out.println("--beforeTestCase");
		MockitoAnnotations.initMocks(this);
		
		acccountService=new AccountServiceImpl(accountDao);
	}
	
	
	@After
	public void afterTestCase(){
		System.out.println("--afterTestCase");
	}
	
	
	@Test
	@Category({GoodTestCategory.class})
	@Ignore
	public void find_by_account_number_testcase(){
		System.out.println("find_by_account_number_testcase");
		Account account=new Account();
		account.setAccountNo(12);
		Customer customer=new Customer();
		account.setCustomer(customer);
		account.setAmount(1000);
		
		
		
		//Mock Objects
		//Declarations
		Mockito.when(accountDao.findAccountById(12)).thenReturn(account);
		
		//INvoke Mock Object
		Account newAcc=acccountService.findAccountById(12);
		
		//Verification of Mock Object
		Mockito.verify(accountDao).findAccountById(12);
		
		
		assertEquals(newAcc.getAccountNo(),account.getAccountNo());
		
	}
	
	
	
	@Test(expected=IllegalArgumentException.class)
	@Category({BadTestCategory.class})
	public void addAccount_with_InvalidCustomer() throws InvalidInitialAmountException{
		
	
		acccountService.addAccount(null, 300);
		
		
	}
	
	@Category({GoodTestCategory.class})
	@Test(expected=InvalidInitialAmountException.class)
	public void addAccount_with_Invalid_InitialAmout() throws InvalidInitialAmountException{
		
	
		acccountService.addAccount(new Customer(), 300);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
