package com.learning.dsa.searchTest;

import com.learning.dsa.search.SearchAlgorithm;

public class LinearSearch implements SearchAlgorithm {

	@Override
	public int search(int[] arr, int s) {
		if(arr == null || arr.length == 0) {
			return -1;
		}
		for(int i=0; i < arr.length; i++) {
			if(arr[i] == s) {
				return i;
			}
		}
		return -1;
	}

}
