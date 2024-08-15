package com.ds.collection.list.practices;

import java.util.Arrays;
import java.util.List;

public class ListPractice3 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		list.subList(1, 3).clear();
		System.out.println(list); 

	}

}
