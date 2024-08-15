package com.ds.collection.list.practices;

import java.util.ArrayList;

public class ListPractice1 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add(null);
		list.add(0, "A");
		list.add(3, "B");
		list.add(1, "C");
		System.out.println(list);
		

	}

}