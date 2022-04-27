import java.util.Scanner;
public class Teenager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr= new Scanner(System.in);
		int age;
		System.out.println("Enter your age:");
		age=scnr.nextInt();
		if(age>=13 && age<=19) {
			System.out.println("Teenager!");
		}
	}

}
