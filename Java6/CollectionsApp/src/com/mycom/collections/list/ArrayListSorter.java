//collections framework> collection interface> list/set/map (sub interfaces)> ArrayList (class implementation)
//collection interface> collections class implementation
package com.mycom.collections.list;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListSorter {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("java");
		al.add("c");
		System.out.println(al.size());
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		Collections.sort(al);
		for(String lang:al) {
			System.out.println(lang);
		}
	}

}
