package com.learning.dsa.ds;

public class QueueWithLinkedList {
	
	LinkedList ll = new LinkedList();
	
	void enqueue(int value) {
		ll.append(value);
	}
	
	int dequeue() {
		Node first = ll.first;
		ll.delete(first.value);
		return first.value;
	}
	
	int peek() {
		Node first = ll.first;
		return first.value;
	}

}
