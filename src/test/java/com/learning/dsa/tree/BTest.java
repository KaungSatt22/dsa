package com.learning.dsa.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

public class BTest {
	
	BTreeRe tree = new BTreeRe();

	@Test
	public void testPreOrderIterative() {
		
		tree.insert(10);
		tree.insert(20);
		tree.insert(5);
		tree.insert(30);
		tree.insert(12);
		tree.insert(15);
		//10,5,20,12,15,30
		Iterator<BNode> iterator = tree.preOrderIterative();
		
		assertEquals(10,iterator.next().value);
		assertEquals(5,iterator.next().value);
		assertEquals(20,iterator.next().value);
		assertEquals(12,iterator.next().value);
		assertEquals(15,iterator.next().value);
		assertEquals(30,iterator.next().value);
		
		assertFalse(iterator.hasNext());
	}
}
