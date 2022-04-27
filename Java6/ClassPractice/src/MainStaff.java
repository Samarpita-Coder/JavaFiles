import java.util.Scanner;
public class MainStaff {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Staff1:");
		System.out.println("Enter name:");
		String name1=sc.next();
		System.out.println("Enter department:");
		String dep1=sc.next();
		System.out.println("Enter tcode:");
		int tcode1=sc.nextInt();
		System.out.println("Staff2:");
		System.out.println("Enter name:");
		String name2=sc.next();
		System.out.println("Enter department:");
		String dep2=sc.next();
		System.out.println("Enter tcode:");
		int tcode2=sc.nextInt();
		
		Staff s1 = new Staff(name1, dep1, tcode1);
		Staff s2 = new Staff(name2, dep2, tcode2);
		
	}

}
