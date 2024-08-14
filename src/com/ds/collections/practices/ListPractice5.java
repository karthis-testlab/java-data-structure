package com.ds.collections.practices;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListPractice5 {

	public static void main(String[] args) {
		
		List<Integer> list_one = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list_two = new LinkedList<>(list_one);
		list_two.subList(1, 3).clear();
		System.out.println(list_two.size());
		System.out.println(list_two);

	}

}