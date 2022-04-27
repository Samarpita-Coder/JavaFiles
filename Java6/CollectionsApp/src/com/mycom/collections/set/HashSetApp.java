package com.mycom.collections.set;

import java.util.HashSet;

public class HashSetApp {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("JAVA");
		hs.add("PYTHON");
		hs.add("C");
		hs.add("PYTHON");
		for(String lang:hs) {
			System.out.println(lang);
		}

	}

}
