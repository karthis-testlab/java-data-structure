package com.ds.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetHandsOn {

	public static void main(String[] args) {
		
		Set<String> linkedSet = new LinkedHashSet<String>();
		linkedSet.add("A");
		linkedSet.add("B");
		linkedSet.add("C");
		linkedSet.add("D");
		
		Iterator<String> iterator = linkedSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(linkedSet.add("A"));
		
		Set<String> linkedSet1 = new LinkedHashSet<String>();
		linkedSet1.add("A");
		linkedSet1.add("B");
		linkedSet1.add("E");
		
		linkedSet.addAll(linkedSet1);
		
		System.out.println(linkedSet);
		
		String string = "AaaaaBbbbbCcccDddd";
		
		String[] strArray = string.split("");
		
		Set<String> set = new LinkedHashSet<String>();
		
		for (String str : strArray) {
			set.add(str);
		}
		
		String newString = "";
		
		for (String str1 : set) {
			newString=newString+str1;
		}
		
		System.out.println(newString);
		
		

	}

}