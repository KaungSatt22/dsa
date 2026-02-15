package com.learning.dsa.ds;


public class CircularQueue extends NormalQueue implements Queue{

	public CircularQueue(int size) {
		super(size);
	}
	
	@Override
	public void enqueue(int item) {
		if(this.size < items.length) {
			this.items[this.rear] = item;
			this.rear = (this.rear+1) % items.length;
			
			size++;
		}else {
			throw new StackOverFlowException("Circular Queue is Full");
		}
	}
	
	@Override
	public int dequeue() {
		if(this.size > 0) {
			int temp = this.front;
			this.front = (this.front +1) % items.length;
			size--;
			return this.items[temp];
		}else {
			throw new StackUnderFlowException("Circular Queue is Empty");
		}
	}

}
