package com.ds.collection.map.practices;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapPratice {

	/**
	 * 
	 * The `ConcurrentMap` is an interface which is part of the Java Collection
	 * Framework and is available in the `java.until.concurrent` package.
	 * 
	 * It extends the `Map` interface and provides thread-safe operations during
	 * retrieval, updation, and removal of elements.
	 * 
	 * The benefit of using `ConcurrentMap` is that it allows high concurrency for
	 * retrieval and updates without affecting the performance.
	 * 
	 * Common implementations of `ConcurrentMap` are `ConcurrentHashMap`,
	 * `ConcurrentSkipListMap`, etc.
	 * 
	 * One of the main features of `ConcurrentMap` is its atomic operations like 
	 * `putIfAbsent()`, `remove()`, and `replace()` which were added to improve 
	 * concurrent handling while ensuring integrity of the data.
	 * 
	 * Here's a brief explanation of these atomic methods:
	 * 
	 * 1. `putIfAbsent(key, value)`: This method adds a key-value pair to the map
	 *    only if the key is not already associated with any value.
	 *    
	 * 2. `remove(key, value)`: This method removes the entry for a key only if it
	 *    is currently mapped to the specified value.
	 *    
	 * 3. `replace(key, oldValue, newValue)`: This method replaces the entry for a
	 *    key only if currently mapped to the specified value.
	 *    
	 * Let me give you an example of using `ConcurrentHashMap`, one of the 
	 * implementations of `ConcurrentMap`.
	 * 
	 */
	public static void main(String[] args) {
		
		ConcurrentMap<Integer, String> concurrentMap = new ConcurrentHashMap<Integer, String>();
		
		// using putIfAbsent()
		concurrentMap.putIfAbsent(1, "Java");
		concurrentMap.putIfAbsent(2, "Python");
		concurrentMap.putIfAbsent(1, "C++");
		
		// Display the contents of the map
		System.out.println("Initial Map: " + concurrentMap);
		
		// using replace()
		concurrentMap.replace(1, "Java", "JavaScript");
		
		// using remove()
		concurrentMap.remove(2, "Python");
		
		// Display the contents of the map after modification
		System.out.println("Updated Map: "+concurrentMap);
				
	}
	
	/*
	 * 
	 * In this example, we created a `ConcurrentHashMap` and demonstrated the usage of
	 * `putIfAbsent()`, `replace()`, and `remove()` method which provide atomicity features
	 * ensuring thread-safe operations.
	 * 
	 * Keep in mind that while `ConcurrentMap` Significantly improves performance and
	 * concurrency compared to synchronized wrappers like `Collections.synchronizeMap()`,
	 * you should analyze if `ConcurrentHashMap` is suitable for your use case or if other 
	 * implementations like `ConcurrentSkipListMap` would be more appropriate based on the
	 * required ordering and navigability.
	 * 
	 */

}
