package com.learning.dsa.ds;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.learning.dsa.sort.ShellSort;
import com.learning.dsa.sort.SortAlgorithm;
import com.learning.dsa.sort.SortUtils;

public class ShellSortTest {
      SortAlgorithm algo = new ShellSort();
      
    @Test
  	public void testBaseCase()
  	{
  		
  		int arr[] = {20,10};
  		int result[] = algo.sort(arr);
  		
  		assertTrue(SortUtils.isSort(result));
  	}
    
  	@Test
  	public void testMany()
  	{
  		
  		int arr[] = {20,10,1,12};
  		int result[] = algo.sort(arr);
  		
  		assertTrue(SortUtils.isSort(result));
  		
  		int arr2[] = SortUtils.genRandomArray(8);
  		result = algo.sort(arr2);
  		
  		assertTrue(SortUtils.isSort(result));
  		
  		int arr3[] = SortUtils.genRandomArray(7);
  		result = algo.sort(arr3);
  		
  		assertTrue(SortUtils.isSort(result));
  		
  		int arr4[] = SortUtils.genRandomArray(15);
  		result = algo.sort(arr4);
  		
  		assertTrue(SortUtils.isSort(result));
  	}
}
