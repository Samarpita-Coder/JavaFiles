

public class Donor extends Person {
    String 	bloodBankName, donorType, donationDate;
	
	

	public String getBloodBankName() {
		return bloodBankName;
	}

	public void setBloodBankName(String bloodBankName) {
		this.bloodBankName = bloodBankName;
	}

	public String getDonorType() {
		return donorType;
	}

	public void setDonorType(String donorType) {
		this.donorType = donorType;
	}

	public String getDonationDate() {
		return donationDate;
	}

	public void setDonationDate(String donationDate) {
		this.donationDate = donationDate;
	}
	
	public void displayDonationDetails() {
		System.out.println("Donation Details :");
		System.out.println("Name : "+super.getName());
		System.out.println("Date Of Birth : "+super.getDateOfBirth());
		System.out.println("Gender : "+super.getGender());
		System.out.println("Mobile Number : "+super.getMobileNumber());
		System.out.println("Blood Group : "+super.getBloodGroup());
		System.out.println("Blood Bank Name : "+bloodBankName);
		System.out.println("Donor Type : "+donorType);
		System.out.println("Donation Date : "+donationDate);
	}
	
}
