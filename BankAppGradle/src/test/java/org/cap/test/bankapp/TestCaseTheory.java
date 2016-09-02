package org.cap.test.bankapp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assume;
import org.junit.Test;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TestCaseTheory {

	
	
	@DataPoints
	public static int[]  myDatas(){
		return new int[]{1,0,-5,3,2,9};
	}
	
	@Theory
	public void testMyTheory(Integer x,Integer y){
		System.out.println(x+ "-->" +y);
		
		Assume.assumeTrue(x>0 && y>0);
		
		Assume.assumeTrue((x+y)>0);
		
	}
	
	
}
