package com.learning.dsa.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class InfixToPostfixTest {
	
	InfixToPostfix infiToPostFix = new InfixToPostfix();
	
	@Test
	void baseTest() {
		String output = infiToPostFix.change(null);
		String output2 = infiToPostFix.change("a+b");
		String output3 = infiToPostFix.change("a+b*c");
		String output4 = infiToPostFix.change("a*b+c");
		assertEquals(null, output);
		assertEquals("ab+", output2);
		assertEquals("abc*+", output3);
		assertEquals("ab*c+", output4);
	}
	
	@Test
	public void testSimpleCase()
	{
		assertEquals("ab+",infiToPostFix.change("a+b"));
		assertEquals("ab+c+",infiToPostFix.change("a+b+c"));
		assertEquals("bc*",infiToPostFix.change("b*c"));
		assertEquals("AB*",infiToPostFix.change("A*B"));
	}
	@Test
	public void testPrecedenceCase()
	{
		assertEquals("abc*+",infiToPostFix.change("a+b*c"));
		assertEquals("ab*c+",infiToPostFix.change("a*b+c"));
		assertEquals("abc*+de*+",infiToPostFix.change("a+b*c+d*e"));
		assertEquals("abc*-de*+",infiToPostFix.change("a-b*c+d*e"));
	}
	
	@Test
	public void testCaseWithParenthesis()
	{
		assertEquals("ab+c*",infiToPostFix.change("(a+b)*c"));
		assertEquals("ab+cd+*",infiToPostFix.change("(a+b)*(c+d)"));
		assertEquals("abc*+de+*",infiToPostFix.change("(a+b*c)*(d+e)"));
	}
	@Test
	public void testWithAllOperators() {
	    assertEquals("abc*+de/+g-", infiToPostFix.change("a+b*c+d/e-g"));
	}
		
}
