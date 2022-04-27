import java.util.Scanner;
import java.io.IOException;
public class Main {

    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name :");
		String name=sc.nextLine();
		System.out.println("Enter Date of Birth :");
		String dob=sc.nextLine();
		System.out.println("Enter Gender :");
		String gender=sc.nextLine();
		System.out.println("Enter Mobile Number :");
		String number=sc.nextLine();
		System.out.println("Enter Blood Group :");
		String bloodGroup=sc.nextLine();
		System.out.println("Enter Blood Bank Name :");
		String bankName=sc.nextLine();
		System.out.println("Enter Donor Type :");
		String type=sc.nextLine();
		System.out.println("Enter Donation Date :");
		String date=sc.nextLine();
		
		Donor donor = new Donor();
		
		donor.setName(name);
		donor.setDateOfBirth(dob);
		donor.setGender(gender);
		donor.setMobileNumber(number);
		donor.setBloodGroup(bloodGroup);
		donor.setBloodBankName(bankName);
		donor.setDonorType(type);
		donor.setDonationDate(date);
		
		donor.displayDonationDetails();

	}

}
