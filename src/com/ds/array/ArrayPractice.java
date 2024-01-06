package com.ds.array;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		
		String[] names = new String[] {"cat", "dog", "fish"};
		System.out.println(Arrays.toString(arrayToUpperCase(names)));
		
		int[] numbers = new int[] {1, 2, 3, 4, 5};
 		System.out.println(Arrays.toString(incrementArray(numbers)));
	}
	
	static String[] arrayToUpperCase(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			strings[i] = strings[i].toUpperCase();
		}
		return strings;		
	}
	
	static int[] incrementArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] += 1;
		}
		return numbers;		
	}


}
