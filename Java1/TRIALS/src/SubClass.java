public class SubClass extends SuperClass{
	int num=10;
	
	public void display() {
		System.out.println("Subclass");
	}
	public void myMethod() {
		SubClass a =  new SubClass();
		a.display();
		super.display();
		System.out.println(a.num);
		System.out.println(super.num);
	}
}