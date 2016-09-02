package org.cap.bank.test;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TestTheory {
	
	private int a,b;

	public TestTheory(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	
	@DataPoints
	public static int[] getDatas(){
		return new int[]{1,-1,0,3,5,7};
	}
	
	
	@Theory
	public void testYourTheory(){
		
		System.out.println(a + "-->" + b);
		
		Assume.assumeTrue(a>0&&b>0);
		
		Assert.assertTrue(a+b>0);
		
	}
	
	

}
