package com.mycom.bean;

public class Student {

		private int rollNo;
		private String name, course;
		private float marks;
		public int getRollNo() {
			return rollNo;
		}
		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		public float getMarks() {
			return marks;
		}
		public void setMarks(float marks) {
			this.marks = marks;
		}
		public Student(int rollNo, String name, String course, float marks) {
			
			this.rollNo = rollNo;
			this.name = name;
			this.course = course;
			this.marks = marks;
		}

	

}
