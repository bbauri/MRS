package com.automation.Collection_Framework.Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTest {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		
		map.put("Password", "AB1001");
		map.put("Name", "Bhola");
		map.put("Country", "India");
		
		System.out.println(map.size());
		
		System.out.println(map);

	}

}
