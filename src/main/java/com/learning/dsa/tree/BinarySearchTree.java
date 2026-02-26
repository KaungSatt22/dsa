package com.learning.dsa.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class BinarySearchTree {
	
	BNode root;
	
	public void insert(int value) {
		BNode bNode = new BNode(value);
		if(root == null) {
			root = bNode;
		}else {
			BNode current = root;
			boolean isDone = false;
			while(!isDone) {
				
				if(value == current.value) {
					isDone = true;
				}
				if(value > current.value) {
					if(current.getRight() != null) {
						current = current.getRight();
					}else {
						current.setRight(bNode);
						isDone = true;
					}
				}else {
					if(current.getLeft() != null) {
						current = current.getLeft();
					}else {
						current.setLeft(bNode);
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
			}else {
				if(value > current.value) {
					current = current.getRight();
				}else {
					current = current.getLeft();
				}
			}
		}
		return false;
	}
	
	
	public Iterator<BNode> preorder(){
		return new PreorderIterator();
	}
	
	class PreorderIterator implements Iterator<BNode> {
		
		public PreorderIterator() {
			travesal(root);
		}
		
		List<BNode> travesaledList = new ArrayList<>();
		
		public void travesal(BNode node) {
			
			travesaledList.add(node);
			if(node.left != null) {
				travesal(node.left);
			}
			if(node.right != null) {
				travesal(node.right);
			}
		}

		@Override
		public boolean hasNext() {
			return !travesaledList.isEmpty();
		}

		@Override
		public BNode next() {
			return travesaledList.remove(0);
		}
		
	}
	
	public Iterator<BNode> inorder(){
		return new InorderIterator();
	}
	
	class InorderIterator implements Iterator<BNode> {
		
		public InorderIterator() {
			travesal(root);
		}
		
		List<BNode> travesaledList = new ArrayList<>();
		
		public void travesal(BNode node) {
			if(node.left != null) {
				travesal(node.left);
			}
			travesaledList.add(node);
			if(node.right != null) {
				travesal(node.right);
			}
		}

		@Override
		public boolean hasNext() {
			return !travesaledList.isEmpty();
		}

		@Override
		public BNode next() {
			return travesaledList.remove(0);
		}
		
	}
	
	public Iterator<BNode> postorder(){
		return new PostorderIterator();
	}
	
	class PostorderIterator implements Iterator<BNode> {
		
		public PostorderIterator() {
			travesal(root);
		}
		
		List<BNode> travesaledList = new ArrayList<>();
		
		public void travesal(BNode node) {
			if(node.left != null) {
				travesal(node.left);
			}
			if(node.right != null) {
				travesal(node.right);
			}
			travesaledList.add(node);
		}

		@Override
		public boolean hasNext() {
			return !travesaledList.isEmpty();
		}

		@Override
		public BNode next() {
			return travesaledList.remove(0);
		}
		
	}
	
	public Iterator<BNode> preorderIterative(){
		return new PreOrderIterative();
	}
	
	class PreOrderIterative implements Iterator<BNode>{
		
		public PreOrderIterative() {
			travesal(root);
		}
		
		List<BNode> visited = new ArrayList<>();
		Stack<BNode> stack = new Stack<>();
		
		public void travesal(BNode node) {
			stack.push(node);
			while(!stack.isEmpty()) {
				
				BNode popNode = stack.pop();
				visited.add(popNode);
				
				if(popNode.right != null) {
					stack.push(popNode.right);
				} 
				if (popNode.left != null) {
					stack.push(popNode.left);
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
	
	public Iterator<BNode> inorderIterative(){
		return new InorderIterative();
	}
	
	class InorderIterative implements Iterator<BNode>{
		
		List<BNode> visited = new ArrayList<>();
		Stack<BNode> stack = new Stack<>();
		
		public InorderIterative() {
			travesal(root);
		}
		
		void travesal(BNode node) {
			BNode current = node;
			while(current != null || !stack.isEmpty()) {
				
				while(current != null) {
					stack.push(current);
					current = current.left;
				}
				
				current = stack.pop();
				visited.add(current);
				
				current = current.right;
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
