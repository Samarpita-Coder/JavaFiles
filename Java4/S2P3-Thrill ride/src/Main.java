import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	Scanner scnr= new Scanner(System.in);
	int age;
	age=scnr.nextInt();
	if(age<15 || age>60) {
		System.out.println("Not Allowed");
	}else {
		System.out.println("Allowed");
	}
	}
}