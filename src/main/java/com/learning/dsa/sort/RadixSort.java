package com.learning.dsa.sort;

import java.util.ArrayList;

public class RadixSort implements SortAlgorithm{

	@Override
	public int[] sort(int[] input) {
		int max  = getMaxLength(input);
		for(int i=0; i < max; i++) {
			
			ArrayList<ArrayList<Integer>> buckets = new ArrayList<ArrayList<Integer>>();
			
			for(int b =0; b < 10; b++) {
				buckets.add(new ArrayList<>());
			}
			
			for(int item : input) {
				buckets.get(getRadix(item,i)).add(item);
			}
			
			int j=0;
			
			for(int b=0; b < 10; b++) {
				for(Integer item: buckets.get(b)) {
					input[j++] = item;
				}
			}
			
		}
		
		return input;
	}
	
	public int getRadix(int input,int i) {
		try {
			String intToString = input + "";
			return Integer.parseInt(intToString.charAt(intToString.length()-1-i)+ "");
		}catch (Exception e) {
			return 0;
		}
	}
	
	public int getMaxLength(int[] input) {
		int max = 1;
		for(int i=0;i < input.length; i++) {
			int intToString = (input[i] + "").length();
			if(intToString > max) {
				max = intToString;
			}
		}
		return max;
	}
	
}
