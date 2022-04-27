import java.util.Scanner;
public class MainEmployee {

	public static void main(String[] args) {
		java.util.Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee();
		e1.computeHra();
		e1.showDetails();
		System.out.println(e1.toString());
		Manager m1 = new Manager();
		m1.computeHra();
		m1.showDetails();

	}

}
