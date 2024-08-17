package com.ds.collection.set.practices;

import java.util.HashSet;
import java.util.Set;

public class SetPractice2 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		boolean result = set.contains("B");
		System.out.println(result);

	}

}