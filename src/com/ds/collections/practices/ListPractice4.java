package com.ds.collections.practices;

import java.util.ArrayList;

public class ListPractice4 {

	public static void main(String[] args) {
		
		var list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.ensureCapacity(3);
		System.out.println(list.size());

	}

}