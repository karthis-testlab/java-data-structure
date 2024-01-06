package com.ds.array;

import java.util.Arrays;

public class ArrayHandsOn {

	public static void main(String[] args) {
		
		/* 
		 * When you first create an array, if you don't say any of the value
		 * are going to be, Java will just use the default value for that
		 * type. So the default value for a String is null and for int will
		 * be zero and for boolean will be false.
		 * 
		 */
		String[] weekdays = new String[7];
		System.out.println(Arrays.toString(weekdays));
		
		weekdays[0] = "Monday";
		System.out.println(Arrays.toString(weekdays));
		
		weekdays = new String[] {"Mon", "Tue", "Wed", "Thr", "Fri", "Sat", "Sun"};
		System.out.println(Arrays.toString(weekdays));
		
		// Iterate over the array
		for (String weekday : weekdays) {
			System.out.println(weekday);
		}
		
		for (int i = 0; i < weekdays.length; i++) {
			System.out.print(weekdays[i]+" ");
		}
	}

}