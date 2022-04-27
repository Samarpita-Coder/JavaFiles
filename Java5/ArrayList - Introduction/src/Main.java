import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		String user;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		int i = 1;
		do {
			System.out.println("Enter the username "+i);
			al.add(sc.nextLine());
			System.out.println("Do you want to continue?(y/n)");
			user = sc.nextLine();
			i++;
		}while(user.equalsIgnoreCase("y"));
		
		System.out.println("The Names entered are:");
		for(String a:al) {
			System.out.println(a);
		}
	}
}
