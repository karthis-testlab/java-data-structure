package com.ds.collection.list.practices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPractice6 {

	public static void main(String[] args) {
		int[] numbers = {2, 3, -102, 1};
		List<Integer> list = new ArrayList<Integer>();	
		for(int i = 0; i < numbers.length; i++) {
			list.add(Math.abs(0 - numbers[i]));
		}
		System.out.println(list);
		System.out.println(Collections.min(list));
		System.out.println(anotherSolution(numbers));
	}
	
	// Finding Closest number to 0
	public static int anotherSolution(int[] numbers) {
		int biggestNegative = Integer.MIN_VALUE;
		int smallestPositive = Integer.MAX_VALUE;
		int result = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] == 0) {
				break;
			}
			if(numbers[i] > 0 && numbers[i] < smallestPositive) {
				smallestPositive = numbers[i];
			}
			if(numbers[i] < 0 && numbers[i] > biggestNegative) {
				biggestNegative = numbers[i];
			}
		}
		if(Math.abs(biggestNegative) < Math.abs(smallestPositive) && biggestNegative != Integer.MIN_VALUE)
			result = biggestNegative;
		else
			result = smallestPositive;
		return result;
	}

}
