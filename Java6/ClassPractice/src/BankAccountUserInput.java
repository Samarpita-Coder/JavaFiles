//instance variables- variables belonging to each objects
//constructor-method having same name that of a class to initialize instance variables
import java.util.Scanner;
public class BankAccountUserInput {
	//instance variables have to be declared outside method/constructor
	Scanner sc=new Scanner(System.in);
	int acntNo;
	String customerName;
	float balance;
	
	//constructor-same function even if we use user defined method...for eg, assignValues(), but constructor does not have any return type
	BankAccountUserInput(){
		//user input can be taken inside constructor
		acntNo=sc.nextInt();
		customerName=sc.next();
		balance=sc.nextFloat();
		
	}
	public void showDetails() {
		System.out.println("Account Number: "+acntNo);
		System.out.println("Name: "+customerName);
		System.out.println("Balance: "+balance);
	}

}
