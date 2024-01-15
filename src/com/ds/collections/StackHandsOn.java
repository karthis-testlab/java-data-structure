package com.ds.collections;

import java.util.Stack;

public class StackHandsOn {

	/*
	 * Stack is a class in Collections framework
	 * Stack implements List interface
	 * Stack follows Last in first out
	 * 
	 * Stack Methods: push, pop, peak, search
	 * 
	 * Create the Stack Object:
	 * Stack<Integer> stack = new Stack<Integer>();
	 * 
	 * push: add the element in the end
	 * pop: delete the last element
	 * peek: get the last element
	 * search: to get the index of the element to be searched in the stack
	 * 
	 */
	public static void main(String[] args) {	
		
		Stack<Integer> stack = new Stack<Integer>();
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		if(stack.isEmpty()) {
			for (int i = 0; i <= arr.length - 1; i++) {
				stack.push(arr[i]);
			}
		} else {
			System.out.println("Stack is non empty");
		}
		
		System.out.println(stack); 
		
		System.out.println(stack.pop());
		System.out.println(stack);
		
		System.out.println(stack.peek());
		System.out.println(stack);
		
	}

}