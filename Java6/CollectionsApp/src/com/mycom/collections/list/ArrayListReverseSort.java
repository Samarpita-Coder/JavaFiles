package com.mycom.collections.list;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverseSort {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Java");
		al.add("C");
		al.add("java");
		
		//Collections.sort(al);
		//Collections.reverse(al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		//System.out.println(al);
	}

}
