package com.mycom.threads.normal;

public class Main {

	public static void main(String[] args) {
		Department hr = new Department("HR");
		Department it = new Department("IT");
		Department lo = new Department("LOGIDTICS");
		
		//start() will invoke the run() method
		//order of execution might be changed
		hr.start();
		it.start();
		lo.start();
	}

}
