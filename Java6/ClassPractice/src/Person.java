
public class Person {
	private String userId; //this 'private' is a convention for the users to know that these variables can be accessed only through the methods
	private String name;
	
	public void setName(String n) {
		name=n;
	}
	public String getName() {
		return name;
	}
	public void display() {
		System.out.println("Name is " + " " + name);
	}
}
