
public class Visacard extends CreditCard{
	
	public Visacard(String name,String num,String type) {
		super(name,num,type);
	}

	
	public void display() {
		System.out.println("Holder Name : "+holderName);
		System.out.println("Card Number : "+cardNumber);
		System.out.println("You have an Authority of : "+cardType);
		
		
	}
	//fill your code here
}

