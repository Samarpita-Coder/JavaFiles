
public class MainCustomer {

	public static void main(String[] args) {
		Classes class1=new Classes();
		class1.assignValues();
		class1.showDetails();
		//to check if an object belongs to a class
		boolean isClasses=class1 instanceof Classes;	//here, isClasses is a variable holding the boolean value

	}

}
