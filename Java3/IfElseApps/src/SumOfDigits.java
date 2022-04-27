import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scnr=new Scanner(System.in);
		int user, sum=0, rem;
		user=scnr.nextInt();
		while(user!=0) {
			rem=user%10;
			sum=sum+rem;
			user=user/10;
		}
		System.out.println("Sum is: " +sum);

	}

}
