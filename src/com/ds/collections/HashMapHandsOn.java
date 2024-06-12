package com.ds.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapHandsOn {

	public static void main(String[] args) {
		
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("Name", "King");
		map.put("Experience", 9);
		map.put("Location", "Budapest");
		map.put("WorkingStatus", true);
		
		System.out.println(map);
		
		Map<String, Integer> fruits = new HashMap<String, Integer>();
		fruits.put("apple", 1);
		fruits.put("banana", 2);
		fruits.put("cherry", 3);
		
		int value = fruits.getOrDefault("banana", 0) + fruits.getOrDefault("orange", 0);
		
		System.out.println(value);

	}

}
