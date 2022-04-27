
public class Employee {
	int id;
	String name;
	float salary,hra;
	//static variable- same value for all objects, belongs to class.. not object
	static String companyName="HCL";
	Employee(){
		id=1;
		name="Sam";
		salary=50000;
	}
	public void computeHra() {
		hra = salary * 0.2f;
	}
	public void showDetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(hra);
	}
	
	public String toString() {
		return id+" "+name+" "+salary+" "+hra+" "+Employee.companyName;
	//adding space to int value will convert it to a string
	//toString will return only string value
	}
}
