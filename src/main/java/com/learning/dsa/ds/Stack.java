package com.learning.dsa.ds;

public class Stack {
	
	int top = -1;
	int[] s;
	
	public Stack(int size) {
		s = new int[size];
	}
	
	void push(int input) {
		if(this.top < s.length -1) {
			s[++this.top] = input;
		}
		else {
			throw new StackOverFlowException("Stack is Full");
		}
	}
	
	int pop() {
		if(this.top >= 0) {
			return s[this.top--];
		}
		else {
			throw new StackUnderFlowException("Stack is Empty");
		}
	}
	
	int peek() {
		if(this.top >= 0) {
			return s[this.top];
		}
		else {
			throw new StackUnderFlowException("Stack is Empty");
		}
	}
	
	int size() {
		return this.top+1;
	}
	
	boolean isEmpty() {
		return this.top == -1;
	}
	boolean isFull() {
		return this.top == s.length -1;
	}
}
