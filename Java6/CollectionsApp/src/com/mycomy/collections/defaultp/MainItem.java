package com.mycomy.collections.defaultp;
import java.util.Scanner;
public class MainItem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter string");
		String str = sc.nextLine();
		
		//two objects created from the same class returning values of different data types
		Item<Integer> intItem = new Item<Integer>();
		intItem.setVar(num);
		
		Item<String> strItem = new Item<String>();
		strItem.setVar(str);
		
		System.out.println("Integer: "+intItem.getVar());
		System.out.println("String: "+strItem.getVar());

	}

}
