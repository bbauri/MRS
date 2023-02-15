package com.automation.Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		
		//ArrayList[c], LinkedList[c], Vector[C]
		List<String> list = new ArrayList<String>();
		
		System.out.println(list.isEmpty());
		
		System.out.println(list.size());
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("G");
		
		System.out.println(list.isEmpty());
		
		System.out.println(list.size());
			
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);

		System.out.println(list.contains("BHOLA"));
		
		list.clear();
		
		System.out.println(list);

		

				
	}

}
