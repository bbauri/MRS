package com.automation.Collection_Framework.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		
Map<String, String> map = new TreeMap<String, String>();
		
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		
		map.put("Password", "AB1001");
		map.put("Name", "Bhola");
		map.put("Country", "India");
		
		System.out.println(map.size());
		
		System.out.println(map);

	}

}
