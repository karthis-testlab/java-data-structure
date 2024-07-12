package com.ds.collections.practices;

import java.util.ArrayList;

public class ListPractice2 {

	public static void main(String[] args) {
		
		var list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		for (int i = 0; i < list.size(); i++) {
			list.remove(i);
		}
		System.out.println(list); 

	}

}