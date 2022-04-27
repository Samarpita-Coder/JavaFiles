package com.mycom.collections.map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
public class TreeMapApp {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of events:");
		int num = Integer.parseInt(sc.nextLine());
		TreeMap<Integer,Integer> tm = new TreeMap<Integer,Integer>();
		System.out.println("Enter event details in CSV(Customer Name,Ticket Price,No of Seats Booked)");
		for(int i =0; i<num; i++) {
			String user = sc.nextLine();
			String arr[]=user.split(",");
			tm.put(Integer.parseInt(arr[1]),Integer.parseInt(arr[2]));
			
		}
		System.out.println(String.format("%-15s %s","Ticket Price","Tickets Booked"));
		Set<Integer> keys = tm.keySet();
		
		for(Integer k:keys) {
			System.out.println(String.format("%-15s %s",k,tm.get(k)));
		}

	}

}
