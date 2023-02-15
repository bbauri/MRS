package com.automation.Collection_Framework.Set;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTest {
	
	public static void main(String[] args) throws Exception {
		
		
		//HashSet or TreeSet
		Set<String> list = new TreeSet<String>();
		
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

