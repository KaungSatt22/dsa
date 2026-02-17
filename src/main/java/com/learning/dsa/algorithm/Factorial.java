package com.learning.dsa.algorithm;

public class Factorial {
	
	public int fact(int num) {
		if(num <= 1) {
			return 1;
		}
		return num * fact(num -1);
	}
}
