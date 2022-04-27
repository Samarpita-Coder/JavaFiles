
public class OuterClass {
	int id;
	String name;
	//inner class object creation 
	//the functions will be called inside a method in outer class
	InnerClass ic_inClass=new InnerClass(); //-either this, or instantiate object inside the method only
	
	public void showDetails() {
		id=123;
		name="sam";
		System.out.println(id);
		System.out.println(name);
		System.out.println("salary of inner class (object created- in class) from method in outer class");
		ic_inClass.showSalary();
		//inner class object can be declared inside the method, but this won't be accessible in the main method
		InnerClass ic_inMethod=new InnerClass();
		System.out.println("salary of inner class (object created- in method) from method in outer class");
		ic_inMethod.showSalary();
		
		
	}	
		//inner class can access all members (methods, variables) of outer class
		//inner class is not a sub class of outer class- methods cannot be overridden
	class InnerClass{
		float salary=25000;
		public void showSalary() {
			System.out.println(salary);
			//showDetails();
			}
	}
	
}
