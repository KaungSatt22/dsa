package com.learning.dsa.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class InfixToPostfix {
	Stack<Character> stack = new Stack<>();
	Map<Character,Integer> priorities = new HashMap<>();
	
	public InfixToPostfix() {
		priorities.put('*', 1);
		priorities.put('/', 2);
		priorities.put('+', 3);
		priorities.put('-', 4);
		priorities.put('(', 5);
	}
	
	private boolean isOperator(Character ch) {
		return ch == '+' || ch == '-' || ch == '*' || ch == '/';
	}
	
	private boolean isCharactor(Character ch) {
		return Character.isLetter(ch);
	}
	
	private boolean compareOperator(Character op1, Character op2) {
		int existInStack = priorities.get(op1);
		int newOperator = priorities.get(op2);
		return newOperator >= existInStack;
	}
	
	String change(String input) {
		if(input == null || input.isEmpty()) {
			return null;
		}
		String output = "";
		for(int i=0;i < input.length(); i++) {
			Character ch = input.charAt(i);
			if(isOperator(ch)) {
				if(stack.size() > 0) {
					if(compareOperator(stack.peek(), ch)) {
						while(!stack.isEmpty()) {
							output += stack.pop();
						}
					}
				}
				stack.add(ch);
			}else if(isCharactor(ch)) {
				output += ch;
			}else {
				if(ch == '(') {
					stack.push(ch);
				}else if(ch == ')') {
					while(!(stack.peek() == '(')) {
						output += stack.pop();
					}
					stack.pop();
				}
			}
		}
		while(!stack.isEmpty()) {
			output += stack.pop();
		}
		return output;
	}
}
