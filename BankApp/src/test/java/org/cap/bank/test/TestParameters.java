package org.cap.bank.test;

import java.util.Arrays;
import java.util.List;

import org.cap.service.AcccountService;
import org.cap.service.AccountServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.Assert;

@RunWith(Parameterized.class)
public class TestParameters {
	
	private AcccountService acccountService=new AccountServiceImpl();

	private int expected;//output
	private int actual;//input
	
	
	public TestParameters(int actual, int expected) {
		super();
		this.expected = expected;
		this.actual = actual;
	}
	
	
	@Parameters
	public static List<Object[]> allParams(){
		return Arrays.asList(new Object[][]{
			{2,4},
			{-1,-2},
			{0,0},
			{1,2},
			{9,18}
		});
	}
	
	
	@Test
	public void testAddNumbers(){
		
		Assert.assertEquals(expected, acccountService.addNumbers(actual, actual));
	}
	
	
	
}
