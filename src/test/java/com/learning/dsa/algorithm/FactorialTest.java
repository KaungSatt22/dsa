package com.learning.dsa.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FactorialTest {
	
	Factorial factorial = new Factorial();
	@Test
	public void testBase()
	{
		assertEquals(1,factorial.fact(0));
		assertEquals(1,factorial.fact(1));
		assertEquals(2,factorial.fact(2));
		assertEquals(6,factorial.fact(3));
		//Factorial.fact(10000);
	}
}
