package com.ds.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListHandsOn {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> synchronizedList = Collections.synchronizedList(list);
		synchronizedList.add(10);
		Iterator<Integer> iterator = synchronizedList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			synchronizedList.add(30);
		}		

	}

}