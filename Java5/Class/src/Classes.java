
public class Classes {
	int id;
	String name;
	String address;
	float billAmount;
	long mobileNumber;
	//methods/actions:
	public void assignValues() {
		id=12345;
		name="sam";
		address="11/1";
		billAmount=23;
		mobileNumber=8756474847L;
	}
	public void showDetails() {
		System.out.println("ID: " +id);
		System.out.println("NAME: "+name);
		System.out.println("ADDRESS: " +address);
	}
}
