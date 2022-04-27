// fill your code here

public class Address {
	
	private String line1;
	private String line2;
	private String city;
	private String country;
	private int zipCode;
	
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
		
	public String toString() {
		return "Address Details :\n"+new StringBuffer().append(line1)+",\n"+new StringBuffer().append(line2)+",\n"+city+" - "+zipCode+"\n"+country;
		
	}
}