package com.learning.dsa.algorithm;

import java.util.HashMap;
import java.util.Stack;

public class ExpressionEvaluator {
	
	InfixToPostfix infixToPostfix = new InfixToPostfix();
	Stack<Integer> stack = new Stack<>();
	
	public boolean isOperand(Character ch) {
		return Character.isLetter(ch);
	}
	
	
	public int execute(String string, HashMap<Character, Integer> variables) {
		String postfix = infixToPostfix.change(string);
		for(int i=0;i < postfix.length();i++) {
			if(isOperand(postfix.charAt(i))) {
				stack.add(variables.get(postfix.charAt(i)));
			}else {
				Integer op2 = stack.pop();
				Integer op1 = stack.pop();
				switch (postfix.charAt(i)) {
				case '+': {
					stack.add(op1 + op2);
					break;
				}
				case '-': {
					stack.add(op1 - op2);
					break;
				}
				case '*': {
					stack.add(op1 * op2);
					break;
				}
				case '/': {
					stack.add(op1 / op2);
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + postfix.charAt(i));
				}
			}
		}
		return stack.pop();
	}
	
}
