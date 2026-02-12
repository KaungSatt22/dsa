package com.learning.dsa.sort;

public class InsertionSort implements SortAlgorithm{

	@Override
	public int[] sort(int[] input) {
		
		if(input == null || input.length == 0) {
			return input;
		}
		
		if(input.length == 1) {
			return input;
		}
		
		for(int i=1; i < input.length;i++) {
			int j=i;
			while(j > 0 && input[j] < input[j-1]) {
				int temp = input[j-1];
				input[j-1] = input[j];
				input[j] = temp;
				j--;
			}
		}
		return input;
	}

}
