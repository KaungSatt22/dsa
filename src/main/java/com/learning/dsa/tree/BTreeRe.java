package com.learning.dsa.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class BTreeRe {
	
	BNode root;
	
	public void insert(int value) {
		BNode newNode = new BNode(value);
		if(root == null) {
			root = newNode;
		}else {
			BNode current = root;
			boolean isDone = false;
			while(!isDone) {
				if(value > current.value) {
					if(current.right != null) {
						current = current.right;
					}else {
						current.right =newNode;
						isDone = true;
					}
				}else {
					if(current.left != null) {
						current = current.left;
					}else {
						current.left = newNode;
						isDone = true;
					}
				}
			}
		}
	}
	
	public boolean search(int value) {
		BNode current = root;
		while(current != null) {
			if(current.value == value) {
				return true;
			}
			if(current.value > value) {
				current = current.right;
			}else {
				current = current.left;
			}
		}
		
		return false;
	}
	
	public Iterator<BNode> preOrderIterative(){
		return new PreOrderIterative();
	}
	
	class PreOrderIterative implements Iterator<BNode>{
		
		public PreOrderIterative() {
			travesal(root);
		}
		
		List<BNode> visited = new ArrayList<>();
		Stack<BNode> stack = new Stack<>();
		
		void travesal(BNode node) {
			
			stack.push(node);
			
			while(!stack.isEmpty()) {
				BNode popStack = stack.pop();
				visited.add(popStack);
				
				if(popStack.right != null) {
					stack.push(popStack.right);
				}
				
				if(popStack.left != null) {
					stack.push(popStack.left);
				}
				
			}
		}

		@Override
		public boolean hasNext() {
			return !visited.isEmpty();
		}

		@Override
		public BNode next() {
			return visited.remove(0);
		}
		
	}
	
	public Iterator<BNode> inOrderIterative(){
		return new PreOrderIterative();
	}
	
	class inOrderIterative implements Iterator<BNode>{
		
		public inOrderIterative() {
			travesal(root);
		}
		
		List<BNode> visited = new ArrayList<>();
		Stack<BNode> stack = new Stack<>();
		
		void travesal(BNode node) {
			
			while(node != null) {
				while(node.left != null) {
					stack.add(node);
					node = node.left;
				}
				
				BNode popNode = stack.pop();
				visited.add(popNode);
				
				node = popNode.right;
			}
		}

		@Override
		public boolean hasNext() {
			return !visited.isEmpty();
		}

		@Override
		public BNode next() {
			return visited.remove(0);
		}
		
	}
	
}
