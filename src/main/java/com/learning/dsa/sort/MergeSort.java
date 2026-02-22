package com.learning.dsa.sort;

public class MergeSort implements SortAlgorithm{
	
	public int[] merge(int[] input,int start,int middle, int end) {
		int[] result = new int[input.length];
		System.arraycopy(input, 0, result, 0, input.length);
		int i = start;
		int j = start;
		int k = middle +1;
		while(i <= middle && k <= end) {
			if(input[i] > input[k]) {
				result[j++] = input[k++];
			}else {
				result[j++] = input[i++];
			}
		}
		
		while(i <= middle) {
			result[j++] = input[i++];
		}
		
		while(k <= end) {
			result[j++] = input[k++];
		}
		return result;
	}
	
	private int[] sort(int[] input,int start,int end) {
		
		if(start == end) {
			return input;
		}
		
		int middle = (start+end)/2;
		input = sort(input,start,middle);
		input = sort(input,middle+1,end);
		
		return merge(input, start, middle, end);
		
		
	}

	@Override
	public int[] sort(int[] input) {
		return sort(input,0,input.length-1);
	}
}
