import java.util.Scanner;
public class AddingUsersNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr=new Scanner(System.in);
		float sum=0.0f;
		float num;
		for(int counter=1; counter<=3; counter++) {
			System.out.println("Enter Number");
			num=scnr.nextFloat();
			sum=sum+num;
		}
		System.out.println("Sum is:" +String.format("%.0f", sum));
	}

}
