package com.mycom.ui;
import com.mycom.bean.Student;

public class MainStudent {

	public static void main(String[] args) {
		Student st = new Student(1,"Sam","CSE",98.6f);
		System.out.println(st.getCourse());
		System.out.println(st.getMarks());
		System.out.println(st.getName());
		System.out.println(st.getRollNo());
		System.out.println(st.getClass());
		
	}

}
