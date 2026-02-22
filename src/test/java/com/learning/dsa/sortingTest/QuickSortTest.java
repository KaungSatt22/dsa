package com.learning.dsa.sortingTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.learning.dsa.sort.QuickSort;
import com.learning.dsa.sort.SortUtils;

public class QuickSortTest {
	
	
	QuickSort algo = new QuickSort();
	
	
	@Test
	public void testPartition()
	{
	
		int[] input = {1,5,3};
		//{1,3,5}
		int pivotIndex = algo.findPivot(input,0,input.length-1);
		
		
		assertEquals(1,pivotIndex);
		
		int[] expected = {1,3,5};
		assertTrue(Arrays.equals(expected, input));
		
		//System.out.println("Array "+Arrays.toString(input));
		
	}
	@Test
	public void testPartition2()
	{
		QuickSort algo = new QuickSort();
		int[] input = {8,7,6,1,0,9,2};
		
		int pivotIndex = algo.findPivot(input,0,input.length-1);
		
		
		assertEquals(2,pivotIndex);
		
		int[] expected = {1,0,2,8,7,9,6};
		assertTrue(Arrays.equals(expected, input));
		
		System.out.println("Array "+Arrays.toString(input));
		
	}
	@Test
	public void testPartition3()
	{
		QuickSort algo = new QuickSort();
		int[] input = {1,0,2,8,7,9,6};
		
		int pivotIndex = algo.findPivot(input,3,input.length-1);
		
		
		assertEquals(3,pivotIndex);
		
		int[] expected = {1,0,2,6,7,9,8};
		assertTrue(Arrays.equals(expected, input));
		
		//System.out.println("Array "+Arrays.toString(input));
		
	}
	@Test
	public void testQuickSortBasecase()
	{
		
		int[] input = {1,5,3};
		//{1,3,5}
		algo.sort(input);
		assertTrue(SortUtils.isSort(input));
		
		int[] input2 = {1,0,2,8,7,9,6};
		algo.sort(input2);
		assertTrue(SortUtils.isSort(input2));
		
		int[] input3 = {1,0};
		algo.sort(input3);
		assertTrue(SortUtils.isSort(input3));
		
		int[] input4 = {1};
		algo.sort(input4);
		assertTrue(SortUtils.isSort(input4));
	}
	@Test
	public void testComplexCase()
	{
		int arr[] = {10,20,1,-1,100};
		algo.sort(arr);
		
		assertTrue(SortUtils.isSort(arr));
		
		for(int i=0;i<10;i++)
		{
			int []input = SortUtils.genRandomArray(30);
			//System.out.println("Input "+Arrays.toString(input));
			algo.sort(input);
			//System.out.println("Output "+Arrays.toString(input));
			assertTrue(SortUtils.isSort(input));
		}
		
	}
}
