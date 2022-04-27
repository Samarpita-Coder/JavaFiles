
public class Person {
	String name;
	int age;
	String gender,address;
	long adharNo;
	String bloodGroup, dob;
	int num1,num2;
	Person(int a, int b){
		System.out.println("Person constructor");
		this.num1=a;
		this.num2=b;
	}
	public void showDetails() {
		System.out.println("Show details from person");
		System.out.println(num1);
		System.out.println(num2);
	}
}
