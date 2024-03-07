package com.ds.collections;

import java.util.HashMap;

public class HashMapHandsOn {

	public static void main(String[] args) {
		
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("Name", "King");
		map.put("Experience", 9);
		map.put("Location", "Budapest");
		map.put("WorkingStatus", true);
		
		System.out.println(map);

	}

}
