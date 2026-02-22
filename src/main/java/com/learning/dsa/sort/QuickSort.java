package com.learning.dsa.sort;

public class QuickSort implements SortAlgorithm{

	@Override
	public int[] sort(int[] input) {
		 merge(input, 0, input.length -1);
		 return input;
	}
	
	public void merge(int[] input,int start,int end) {
		
		if(start < end) {
			int pivoit = findPivot(input, start, end);
			merge(input,start,pivoit-1);
			merge(input,pivoit+1, end);

		}
	}
	
	public int findPivot(int[] input,int start,int end) {
		int i = start;
		int j = start;
		int pivot = end;
		
		while(j < end) {
			if(input[j] < input[pivot]) {
				int temp = input[i];
				input[i++] = input[j];
				input[j] = temp;
			}
			j++;
		}
		int temp = input[i];
		input[i] = input[pivot];
		input[pivot] = temp;
	
		return i;
	}

}
