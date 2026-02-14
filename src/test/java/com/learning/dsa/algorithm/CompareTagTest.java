package com.learning.dsa.algorithm;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CompareTagTest {
	
	CompareTag matcher = new CompareTag();
	
	@Test
	public void testBase()
	{
		assertTrue(matcher.compare(null));
		assertTrue(matcher.compare(""));
		assertTrue(matcher.compare("ae"));
	}
	@Test
	public void testSinlgePositive()
	{
		assertTrue(matcher.compare("c[d]"));
		assertTrue(matcher.compare("[][][]"));
		assertTrue(matcher.compare("[a[b[c]]]"));
		assertTrue(matcher.compare("{a}"));
		assertTrue(matcher.compare("[({a})]"));
	}
	@Test
	public void testSinlgeNegative()
	{
		assertFalse(matcher.compare("c[d"));
		assertFalse(matcher.compare("cd]"));
		assertFalse(matcher.compare("cd]]"));
		assertFalse(matcher.compare("cd[["));
		assertFalse(matcher.compare("cd]["));
		assertFalse(matcher.compare("{a"));
		assertFalse(matcher.compare("a}"));
		assertFalse(matcher.compare("[({a})"));
	}
}
