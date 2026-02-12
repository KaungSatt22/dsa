package com.learning.dsa.sort;

import java.util.Random;

public class SortUtils {
	public static boolean isSort(int[] input) {
		
		if(input == null || input.length == 0) {
			return false;
		}
		
		if(input.length == 1) {
			return true;
		}
		
		for(int i=0; i < input.length -1;i++) {
			if(input[i]> input[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	public static int[] genRandomArray(int size) {
		int[] arr = new int[size];
		Random r = new Random();
		for(int i=0; i < size; i++) {
			arr[i] = r.nextInt(100);
		}
		return arr;
		
	}
}
