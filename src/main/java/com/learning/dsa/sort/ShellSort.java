package com.learning.dsa.sort;

public class ShellSort implements SortAlgorithm{

	@Override
	public int[] sort(int[] input) {
		int gap = (input.length) /2;
		
		while(gap > 0) {
			for(int i = gap; i < input.length; i++) {
				
				int tem = input[i];
				int j = i;
				
				while(j >= gap && input[j-gap] > tem) {
					input[j] = input[j-gap];
					j -= gap;
				}
				
				input[j] = tem;
				
			}
			gap/=2;
		}
		
		return input;
	}

}
