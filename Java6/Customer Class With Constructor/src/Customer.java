public class Customer{
	public String customerName;
	public String customerEmail;
	public String customerType;
	public String customerAddress;
	
	public Customer(String n, String e, String t, String a) {
		this.customerName=n;
		this.customerEmail=e;
		this.customerType=t;
		this.customerAddress=a;
	}
	
	
	public void displayDetails(){
		System.out.println("Name: "+customerName);
		System.out.println("E-mail: "+customerEmail);
		System.out.println("Type: "+customerType);
		System.out.println("Location: "+customerAddress);
	}
	
}
