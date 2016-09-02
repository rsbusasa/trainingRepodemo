package org.cap.test.bankapp;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.Timeout;

public class DemoTestCases {

	@Test
	@Category(BadTestCategory.class)
	public void test() {
		//fail("Not yet implemented");
	}

	
	@Rule
	public Timeout timeOut=new Timeout(1);
	@Category(BadTestCategory.class)
	//@Test(timeout=500)
	@Test
	public void testTime(){
		long sum=0;
		for(long i=0;i<553554l;i++){
			sum+=i;
		}
		
	}
	
	
	
}
