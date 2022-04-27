package com.mycom.collections.map;
//key-value pairs
//keys are unique
//values can be duplicate
//HashMap- keys are unique and unordered
//TreeMap- keys are unique and sorted

import java.util.HashMap;
import java.util.Set;

public class HashMapApp {

	public static void main(String[] args) {
		HashMap<String, String> hs = new HashMap<String, String>();
		hs.put("India","Delhi");
		hs.put("Norway","Oslo");
		hs.put("Germany","Berlin");
		System.out.println(hs.get("India"));	//printing the keys
		System.out.println(hs);	//printing the map
		
		//printing the keys and values
		//keys can be stored in Set only...they are unique (Set is also unique)
		Set<String> keys = hs.keySet();
		for(String k:keys) {
			System.out.println(k+" "+hs.get(k));
		}

	}

}
