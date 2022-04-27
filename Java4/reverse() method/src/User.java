public class User implements Comparable<User> {
	String name, mobileNumber, username, password;

	public User(String name, String mobileNumber, String username, String password) {

		this.name = name;
		this.mobileNumber = mobileNumber;
		this.username = username;
		this.password = password;
		
	}
	
	public User() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public int compareTo(User user) {
		return this.name.compareTo(((User)user).getName());
	}
	
	public String toString(){
		return this.name+"           "+this.mobileNumber;
		
		
	}
}
