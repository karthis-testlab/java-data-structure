package com.ds.collection.list.practices;

import java.util.Iterator;
import java.util.LinkedList;

public class ListPractice7 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Iterator<Integer> iterator = list.descendingIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}