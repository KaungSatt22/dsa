package com.learning.dsa.ds;

import java.util.Iterator;

public class LinkedList {
	
	
	public Node first;
	public Node last;
	
	public void append(int value) {
		Node newNode = new Node(value);
		if(first == null) {
			this.first = newNode;
			this.last = newNode;
		}else {
			last.next = newNode;
			last = newNode;
		}
	}
	
	public void prepend(int value) {
		Node newNode = new Node(value);
		if(first == null) {
			this.first = newNode;
			this.last = newNode;
		}else {
			newNode.next = this.first;
			this.first = newNode;	
		}
	}
	
	
	public Node findNode(int value) {
		Node current = first;
		while(current != null) {
			if(current.value == value) {
				return current;
			}
			current = current.next;
		}
		return current; 
		
	}
	
	public boolean contains(int value) {
		return findNode(value) != null;
	}
	
	public void delete(int value) {
		Node deleteNode = findNode(value);
		Node previous = null;
		if(deleteNode == first) {
			first = deleteNode.next;
			if(deleteNode.next == null) {
				last = deleteNode.next;
			}
		}else if(deleteNode == last) {
			Node current = first;
			while(current != null) {
				if(current.next.value == value) {
					current.next = null;
					last = current;
					break;
				}
				current= current.next;
			}
			
		}else  {
			Node current = first;
			while(current != null) {
				if(current.next.value == value) {
					previous = current;
					break;
				}
				current= current.next;
			}
			if(previous != null) {
				previous.next = deleteNode.next;
			}
		}
	}
	
	Iterator<Node> createIterator(){
		return new LinkedListIterator();
	}
	
	class LinkedListIterator implements Iterator<Node>{
		
		Node current = first;

		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public Node next() {
			Node temp = current;
			current = current.next;
			return temp;
		}
		
	}
}
