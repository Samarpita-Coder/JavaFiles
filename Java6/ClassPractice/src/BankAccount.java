//instance variables- variables belonging to each objects
//constructor-method having same name that of a class to initialize instance variables
public class BankAccount {
	//these are instance variables
	int acntNo;
	String customerName;
	float balance;
	//constructor-same function even if we use user defined method...for ex, assignValues(), but constructor does not have any return type
	BankAccount(){
		acntNo=12345;
		customerName="Samarpita";
		balance=50000.00f;
		
	}
	public void showDetails() {
		System.out.println("Account Number: "+acntNo);
		System.out.println("Name: "+customerName);
		System.out.println("Balance: "+balance);
	}

}
