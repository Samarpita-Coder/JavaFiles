
public class MainPerson {

	public static void main(String[] args) {
		Person pr1=new Person();
		Person pr2=new Person();
		pr1.setName("Sam");
		pr2.setName("Max");
		pr1.display();
		pr2.display();
		//other way to display the name...using getter method:
		System.out.println(pr1.getName());
	}

}
