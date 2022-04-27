import java.util.Scanner;
public class Switch1 {
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2,choice,result=0;
		String name=null;
		System.out.println("Enter first no:");
		num1=sc.nextInt();
		System.out.println("Enter second no:");
		num2=sc.nextInt();
		System.out.println("Enter your choice:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
		choice=sc.nextInt();
		switch (choice) {
		case 1:
			result=num1+num2;
			break;
		case 2:
			result=num1-num2;
			break;
		case 3:
			result=num1*num2;
			break;
		case 4:
			result=num1/num2;
			break;
		default:
			System.out.println("Wrong choice!");
			break;
			
		}
		System.out.println("RESULT: "+result);

	}

}
