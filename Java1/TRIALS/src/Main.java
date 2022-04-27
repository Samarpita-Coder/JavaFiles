import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Address Details :\nEnter Line 1 :");
		String line1=sc.nextLine();
		System.out.println("Enter Line 2 :");
		String line2=sc.nextLine();
		System.out.println("Enter City :");
		String city = sc.nextLine();
		System.out.println("Enter Country :");
		String country = sc.nextLine();
		System.out.println("Enter Zip Code :");
		int zipCode=Integer.parseInt(sc.nextLine());
		
		
		
		Address address = new Address();
		
		address.setCity(city);
		address.setCountry(country);
		address.setLine1(line1);
		address.setLine2(line2);
		address.setZipCode(zipCode);
		
		System.out.println(address);
	}

}
