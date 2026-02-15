package com.learning.dsa.ds;

public class NormalQueue implements Queue{
	
	int front = 0;
	int rear = 0;
	int size = 0;
	int[] items;
	
	public NormalQueue(int size) {
		this.items = new int[size];
	}
	
	
	@Override
	public void enqueue(int item) {
		if(this.rear < items.length) {
			this.items[this.rear++] = item;
			size++;
		}else {
			throw new StackOverFlowException("Queue is Full");
		}
		
	}
	
	@Override
	public int dequeue() {
		if(size > 0) {
			size--;
			return this.items[this.front++];
		}else {
			throw new StackUnderFlowException("Queue is Empty");

		}
	}
	
	@Override
	public int getSize() {
		return this.size;
	}
	
	@Override
	public int peek() {
		return this.items[this.front];
	}
	
	

}
