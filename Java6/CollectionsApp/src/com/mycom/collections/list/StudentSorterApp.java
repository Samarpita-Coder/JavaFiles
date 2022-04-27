package com.mycom.collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSorterApp {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		//ArrayList of students with their respective info
		al.add(new Student(101,"vijay",25));
		al.add(new Student(105,"Jai",29));
		al.add(new Student(109,"ajay",22));
		
		Collections.sort(al);
		for(Student st:al) {
			System.out.println(st.roll+" "+st.name+" "+st.age);
		}

	}

}
