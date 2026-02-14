package com.learning.dsa.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.learning.dsa.algorithm.Transform;

public class TransformTest {
	
	Transform tran = new Transform();
	
	@Test
	public void testBase()
	{
		String output = tran.transform("");
		assertEquals("",output);
	}
	
	@Test
	public void testBaseCaseNull()
	{
		String output = tran.transform(null);
		assertEquals(null,output);
	}
	@Test
	public void testBundary()
	{
		String output = tran.transform("h");
		assertEquals("H",output);
	}
	@Test
	public void testBasicInput()
	{
		String output = tran.transform("hello");
		assertEquals("Hello",output);
	}
	@Test
	public void testBasicInput2()
	{
		String output = tran.transform("hello world");
		assertEquals("Hello World",output);
	}

}
