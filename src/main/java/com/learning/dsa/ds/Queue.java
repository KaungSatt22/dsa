package com.learning.dsa.ds;

public interface Queue {
	
	void enqueue(int item);
	
	int dequeue();
	
	int getSize();
	
	int peek();
}
