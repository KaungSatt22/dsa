package com.learning.dsa.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CompareTag {
	
	List<Character> openTags = new ArrayList<>();
	List<Character> closeTags = new ArrayList<>();
	Stack<Character> stack;
	
	public CompareTag() {
		openTags.add('(');
		openTags.add('[');
		openTags.add('{');
		
		closeTags.add(')');
		closeTags.add(']');
		closeTags.add('}');
	}
	
	private boolean isEmpty() {
		return stack.isEmpty();
	}
	
	private boolean isOpenTag(Character ch) {
		return openTags.contains(ch);
	}
	
	private boolean isCloseTag(Character ch) {
		return closeTags.contains(ch);
	}
	
	private boolean isCompare(Character op, Character close) {
		int opIdx = openTags.indexOf(op);
		int closetag = closeTags.get(opIdx);
		return closetag == close;
	}
	
	public boolean compare(String input) {
		stack = new Stack<>();
		if(input == null || input.isEmpty()) {
			return true;
		}
		for(int i=0; i < input.length();i++) {
			Character c = input.charAt(i);
			if(isOpenTag(c)) {
				stack.add(c);
			}else if(isCloseTag(c)){
				if(isEmpty()) {
					return false;
				}
				Character op = stack.pop();
				if(!isCompare(op, c)) {
					return false;
				}
				
			}
			
		}
		return isEmpty();
		
	}
}
