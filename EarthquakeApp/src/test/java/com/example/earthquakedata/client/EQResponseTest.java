package com.example.earthquakedata.client;


import org.junit.Test;

public class EQResponseTest {
	private EQResponse classUnderTest;
	
	@Test
	public void checkToString(){
		classUnderTest = new EQResponse();
		classUnderTest.setType("5");
		System.out.println(classUnderTest.toString());
	}
}
