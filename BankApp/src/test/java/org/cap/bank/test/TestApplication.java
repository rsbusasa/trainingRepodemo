package org.cap.bank.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestApplication {

	@Test
	@Category({BadTestCategory.class})
	public void test() {
		//fail("Not yet implemented");
	}

	
	@Category({GoodTestCategory.class})
	@Test(timeout=30)
	public void checkLoop(){
		long sum=0;
		for(long i=0;i<10000l;i++)
			sum=sum+i;
	}
	
	
}
