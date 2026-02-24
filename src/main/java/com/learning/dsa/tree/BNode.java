package com.learning.dsa.tree;

public class BNode {
	int value;
	BNode left;
	BNode right;
	
	public BNode(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public BNode getLeft() {
		return left;
	}
	public void setLeft(BNode left) {
		this.left = left;
	}
	public BNode getRight() {
		return right;
	}
	public void setRight(BNode right) {
		this.right = right;
	}
	
	public boolean isLeaf() {
		return this.right == null && this.left == null;
	}
	
	
}
