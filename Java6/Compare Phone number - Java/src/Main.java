import java.util.Scanner;

class Main{
	public static void main(String[] args) { 		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name");
		String name1=sc.next();
		System.out.println("Enter UserName");
		String username1=sc.next();
		System.out.println("Enter Password");
		String password1=sc.next();
		System.out.println("Enter PhoneNumber");
		long phoneNumber1=sc.nextLong();
		
		System.out.println("Enter Name");
		String name2=sc.next();
		System.out.println("Enter UserName");
		String username2=sc.next();
		System.out.println("Enter Password");
		String password2=sc.next();
		System.out.println("Enter PhoneNumber");
		long phoneNumber2=sc.nextLong();
		
		User user1= new User(name1,username1,password1,phoneNumber1);
		User user2= new User(name2,username2,password2,phoneNumber2);
		
		boolean result=user1.comparePhoneNumber(user2);
		
		if(result==true) {
			System.out.println("Same Users");
		}else {
			System.out.println("Different Users");
		}
		
		
		
	}
}
