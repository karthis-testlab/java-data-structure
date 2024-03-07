package com.ds.array;

import java.util.Arrays;

public class ArrayCopyRange {

	public static void main(String[] args) {
		
		/*
		 * copyOfRange(int[] original, int from, int to) 
		 * 
		 * Copies the specified range of the specified array into a new array.
		 * 
		 */
		
		int arr[] = { 10, 20, 30, 40, 50 };
		int brr[] = Arrays.copyOfRange(arr, 3, 5);
		
		System.out.println(Arrays.toString(brr));

	}

}