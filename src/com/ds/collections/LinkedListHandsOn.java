package com.ds.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListHandsOn {

	public static void main(String[] args) {
		
		LinkedList<String> shoppingList = new LinkedList<String>();
		// Add items to list
		shoppingList.add("Apple");
		shoppingList.add("Banana");
		shoppingList.add("Pear");
		
		// LinkedList keeps items in the same order
		System.out.println(shoppingList);
		
		/*
		 * poll() method deletes the head of the list and returns it.
		 * 
		 * Return Value: This function returns the first element (head)
		 * of the linked list if there're elements in the list.
		 * 
		 * if the list is empty, it returns null.
		 * 
		 */
		System.out.println(shoppingList.poll());
		
		// After ran the poll method what're the elements are presented in the list
		System.out.println(shoppingList);
		
		// Put the index where we want the element to go
		shoppingList.add(1, "Mango");
		System.out.println(shoppingList);
		
		/* 
		 * --> LinkedLists are quite quick at adding elements
		 * --> LinkedLists are quicker than ArrayList for adding and
		 *     removing elements
		 * --> LinkedLists are bit slower when randomly accessing elements
		 *     it has to go through and see what one comes next until it gets
		 *     to the one at once. So ArrayList are quicker for randomly
		 *     accessing elements
		 * --> But LinkedLists are quicker for adding and deleting elements       
		 *     from list.
		 * --> LinkedList methods: addFirst, addLast, removeFirst and removeLast		 *
		 * 
		 */
		
		shoppingList.removeFirst();
		System.out.println(shoppingList);
		
		// LinkedLists aren't synchronized, which is a good thing in terms of performance and memory 
		// and things like that. But it does mean that it's not thread safe. 
		// So if you've got multiple threads trying to modify the list at the same time, they might
		// overwrite each other's changes.
		
		List<String> synchronizedList = Collections.synchronizedList(shoppingList);
		System.out.println(synchronizedList);

	}

}