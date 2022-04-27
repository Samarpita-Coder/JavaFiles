
public class ContactDetail {
    private String mobileNumber;
	private	String alternateMobileNumber;
	private	String landline;
	private	String email;
	private String address;
	
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	
	public String getAlternateMobileNumber() {
		return alternateMobileNumber;
	}
	
	public String getLandline() {
		return landline;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getAddress() {
		return address;
	}
	
    public ContactDetail(String mobileNumber, String alternateMobileNumber, String landline, String email,
			String address) {
		
		this.mobileNumber = mobileNumber;
		this.alternateMobileNumber = alternateMobileNumber;
		this.landline = landline;
		this.email = email;
		this.address = address;
	}
    
    public ContactDetail() {
    	
    }
	public String toString() {
        return("Mobile:"+mobileNumber+"\n"+"Alternate mobile:"+alternateMobileNumber+"\n"+"LandLine:"+landline+"\n"+"Email:"+email+"\n"+"Address:"+address);
    }
}
