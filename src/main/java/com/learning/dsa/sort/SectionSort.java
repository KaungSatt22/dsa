package com.learning.dsa.sort;

public class SectionSort implements SortAlgorithm{

	@Override
	public int[] sort(int[] input) {
		
		if(input == null || input.length == 0) {
			return input;
		}
		
		if(input.length == 1) {
			return input;
		}
		
		for(int i=0;i < input.length;i++) {
			int minIdx = i;
			for(int j=i+1; j < input.length; j++) {
				if(input[minIdx] > input[j]) {
					minIdx = j;
				}
			}
			int temp = input[i];
			input[i] = input[minIdx];
			input[minIdx] = temp;
		}
		return input;
	}

}
