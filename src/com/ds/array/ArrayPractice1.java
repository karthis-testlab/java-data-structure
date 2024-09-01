package com.ds.array;

import java.util.Arrays;

public class ArrayPractice1 {

	public static void main(String[] args) {
		int[] arr = {5, 3, 8, 1, 2};
		Arrays.sort(arr, 1 ,4);
		System.out.println(Arrays.toString(arr)); 
	}

}