import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scnr=new Scanner(System.in);
		int user;
		user=scnr.nextInt();
		for(int counter=1; counter<=user; counter++) {
			for(int inside=1; inside<=counter; inside++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
}