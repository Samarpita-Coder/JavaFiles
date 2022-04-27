package com.mycom.collections.set;



public class Student implements Comparable<Student> {

	int roll;
	String name;
	int age;
	
	//Collections.sort() will automatically invoke the compareTo 
	public int compareTo(Student ca) {
		if(age==ca.age) {
			return 0;
		}else if(age>ca.age) {
			return -1;
		}else
		return 1;
	}
	public Student(int roll, String name, int age) {
		
		this.roll = roll;
		this.name = name;
		this.age = age;
	}
	
	

}
