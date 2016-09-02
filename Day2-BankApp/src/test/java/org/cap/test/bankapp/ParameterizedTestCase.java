package org.cap.test.bankapp;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.cap.service.AcccountService;
import org.cap.service.AccountServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTestCase {

	
	private AcccountService acccountService=new AccountServiceImpl();
	private int input;
	private int expected;
	
	
	public ParameterizedTestCase(int input, int expected) {
		
		this.input = input;
		this.expected = expected;
	}
	
	
	
	@Parameters
	public static List<Object[]> myParameters(){
		return Arrays.asList(new Object[][]{
			//{new int[]{1,2,3},4},
			{4,8},
			{0,0},
			{-1,-2}
		});
		
	}
	
	@Test
	public void test_AddNumbers_with_many_inputs(){
		System.out.println(input+"-->" +expected);
		assertEquals(expected, acccountService.addNumbers(input, input));
	}
	
}
