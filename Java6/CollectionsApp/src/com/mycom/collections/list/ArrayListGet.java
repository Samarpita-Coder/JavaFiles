package com.mycom.collections.list;
import java.util.ArrayList;
public class ArrayListGet {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("java");
		al.add("c");
		System.out.println(al.size());
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		al.remove(0);
		System.out.println(al);
	}

}
