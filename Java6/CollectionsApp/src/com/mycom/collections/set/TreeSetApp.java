package com.mycom.collections.set;


import java.util.TreeSet;

public class TreeSetApp {

	public static void main(String[] args) {
		TreeSet<String> hs = new TreeSet<String>();
		hs.add("JAVA");
		hs.add("PYTHON");
		hs.add("C");
		hs.add("PYTHON");
		hs.add("java");
		hs.add("python");
		for(String lang:hs) {
			System.out.println(lang);
		}

	}

}
