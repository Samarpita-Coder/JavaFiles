
public class Scholar extends Person{
	int id;
	
	String mailId, domain, batchCode;
	float stipend;
	int num3,num4;
	Scholar(int a, int b) {
		super(a,b);
		System.out.println("Scholar constructor");
		this.num3=a;
		this.num4=b;
		
	}
	public void login() {
		
	}
	public void logout() {
		
	}
	public void showDetails() {
		System.out.println("sow details from scholar");
	}
	
}
