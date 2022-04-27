import java.util.HashSet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
  
    	String user;
    	Scanner sc = new Scanner(System.in);
		HashSet<String> set = new HashSet<String>();
		do {
			System.out.println("Enter the username");
			set.add(sc.nextLine());
			System.out.println("Do you want to continue? (Y/N)");
			user=sc.nextLine();
		}while(user.equalsIgnoreCase("y"));
		System.out.println("The unique number of usernames is "+set.size());
	}

}

