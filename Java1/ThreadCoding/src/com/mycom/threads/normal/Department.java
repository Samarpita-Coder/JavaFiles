package com.mycom.threads.normal;

public class Department extends Thread{
	String name;
	
	Department(String name){
		this.name=name;
	}
	
	public void run() {
		for(int c=1; c<=5; c++) {
			System.out.println("Department- "+name+" task "+c);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
