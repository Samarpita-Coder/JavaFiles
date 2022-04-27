import java.util.Scanner;
public class TernaryOperator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num1, num2, large;
		System.out.println("Enter first no:");
		num1=scnr.nextInt();
		System.out.println("Enter second no:");
		num2=scnr.nextInt();
		large=(num1>num2)?num1:num2;
		System.out.println("Largest number is " +large);

	}

}
