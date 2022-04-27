
public class MainScholar {

	public static void main(String[] args) {
		//constructor will be executed from both super and subclass when called
		//method will be executed only from the sub class when called
		Person pr= new Person(1,2);
		Scholar sc= new Scholar(3,4);
		pr.showDetails();

	}

}
