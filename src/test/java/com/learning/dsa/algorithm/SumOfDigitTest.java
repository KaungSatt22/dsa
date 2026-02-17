package com.learning.dsa.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SumOfDigitTest {
	
	SumOfDigit sumOfDigit = new SumOfDigit();
	
	@Test
	public void testSumOfDigit()
	{
		assertEquals(0,sumOfDigit.sum(0));
		assertEquals(1,sumOfDigit.sum(1));
		assertEquals(1,sumOfDigit.sum(10));
		assertEquals(3,sumOfDigit.sum(12));
		assertEquals(4,sumOfDigit.sum(121));
	}
}
