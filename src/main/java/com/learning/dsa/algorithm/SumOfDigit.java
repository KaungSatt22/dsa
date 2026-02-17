package com.learning.dsa.algorithm;

public class SumOfDigit {
	
	public int sum(int num) {
		if(num < 10) {
			return num;
		}
		return (num %10) + sum(num / 10);
	}
}
