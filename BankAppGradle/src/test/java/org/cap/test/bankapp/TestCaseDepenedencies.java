package org.cap.test.bankapp;

import static org.junit.Assert.*;

import org.cap.dao.AccountDao;
import org.cap.dao.AccountDaoImpl;
import org.cap.dto.Account;
import org.cap.dto.Address;
import org.cap.dto.Customer;
import org.cap.exception.InsufficientBalanceException;
import org.cap.service.AcccountService;
import org.cap.service.AccountServiceImpl;
import org.cap.util.AccountUtil;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class TestCaseDepenedencies {

	
	private AcccountService accountService;
	
	//@Mock
	private AccountDao accountDao;
	
	@Before
	public void initMethod(){
		//MockitoAnnotations.initMocks(this);
		accountDao=Mockito.mock(AccountDaoImpl.class);
		accountService=new AccountServiceImpl(accountDao);
	}
	
	@Test
	public void test_findByAccountId(){
		
		Account account=new Account();
		Customer customer=new Customer();
		customer.setCustName("Tom");
		customer.setCustAddress(new Address());
		
		account.setAmount(1000);
		account.setAccountNo(1001);
		
		
		//Declaration
		Mockito.when(accountDao.findAccountById(1001)).thenReturn(account);
		
		
		//Real Application Logic
		Account acc=accountService.findAccountById(1001);
		
		//Verification
		Mockito.verify(accountDao).findAccountById(1001);
		
		
		//assertEquals(account.getAccountNo(), acc.getAccountNo());
		
		//assertEquals(1000, acc.getAmount(),0.00);
		
	}
	
	/*@Test
	public void test_WithDrawal_method() throws InsufficientBalanceException{
		Account account=new Account();
		Customer customer=new Customer();
		customer.setCustName("Tom");
		customer.setCustAddress(new Address());
		
		account.setAmount(1000);
		account.setAccountNo(1001);
		
		
		//Declaration
		Mockito.when(accountDao.findAccountById(1001)).thenReturn(account);
		
		
		Account acc=accountService.withdraw(1001, 400);
		
		
		Mockito.verify(accountDao).findAccountById(1001);
		
		assertEquals(600, acc.getAmount(),0.00);
		
	}
	*/
	
}
