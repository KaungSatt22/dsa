package com.learning.dsa.search;

public class BinarySearch implements SearchAlgorithm{

	@Override
	public int search(int[] arr, int s) {
		
		if(arr == null || arr.length == 0) {
			return -1;
		}
		int start = 0;
		int end = arr.length -1;
		while(start <= end) {
			int middle = (start + end) /2;
			if(arr[middle] == s) {
				return middle;
			}else if(arr[middle] > s) {
				end = middle -1;
			}else {
				start = middle +1;
			}
		}
		return -1;
	}

}
