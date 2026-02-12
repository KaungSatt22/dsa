package com.learning.dsa.sort;

public class BubbleSort implements SortAlgorithm{

	@Override
	public int[] sort(int[] input) {
		
		if(input == null || input.length == 0) {
			return input;
		}
		
		if(input.length == 1) {
			return input;
		}
		
		for(int i=0;i < input.length;i++) {
			for(int j=i+1; j < input.length; j++) {
				if(input[i] > input[j]) {
					int temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		return input;
	}

}
