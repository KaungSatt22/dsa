package com.learning.dsa.ds;

public class StackWithLinkedList {
	
	LinkedList ll = new LinkedList();
	
	void push(int value) {
		ll.append(value);
	}
	
	int pop() {
		Node last = ll.last;
		ll.delete(last.value);
		return last.value;
	}
	
	int peek() {
		Node last = ll.last;
		return last.value;
	}

}
