
public class Main {
	public static void main(String[] args) {
		OuterClass oc=new OuterClass();
		//oc.showDetails();
		//System.out.println("salary of inner class from main method (object created in class)");
		//oc.ic_inClass.showSalary();
		//instantiate inner object in main method
		OuterClass.InnerClass ic_inMainMethod = oc.new InnerClass();
		//accessing inner class method and variable from main method
		System.out.println("salary of inner class from main method (object created in main method)");
		ic_inMainMethod.salary=50000;
		ic_inMainMethod.showSalary();
	}
}
