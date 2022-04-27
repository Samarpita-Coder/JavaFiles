package com.mycom.collections.list;

public class Student implements Comparable<Student> {

	int roll;
	String name;
	Integer age;
	
	//Collections.sort() will automatically invoke the compareTo 
	public int compareTo(Student ca) {
		return this.age.compareTo(((Student) ca).getAge());
		/*if(age==ca.age) {
			return 0;
		}else if(age>ca.age) {
			return -1;
		}else
		return 1;*/
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(int roll, String name, int age) {
		
		this.roll = roll;
		this.name = name;
		this.age = age;
	}
	
	

}
