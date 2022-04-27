import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Customer Details");
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the email");
		String email=sc.next();
		System.out.println("Enter the type");
		String type=sc.next();
		System.out.println("Enter the location");
		String address=sc.next();
		
		Customer c1=new Customer(name,email,type,address);
		
		c1.displayDetails();
		
		
	}
}


