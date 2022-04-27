import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionApp {
	public static void main(String args[]) {
		Scanner scnr=new Scanner(System.in);
		
		int seats[]= new int[100];
		int i=0;
		while(i<100) {
			seats[i]= i+1;
			i++;
			
		}
		//for(int a:seats) {
			//System.out.println(a);
		//}
		int num, seatNo;
		System.out.println("Enter the number of seats to be booked:");
		num=scnr.nextInt();
		int userSeats[]= new int[num];
		int j=1;
		while(j<=num) {
			System.out.println("Enter the seat number "+j);
			seatNo=scnr.nextInt();
			try{
				userSeats[j-1]=seats[seatNo-1];
				
				
			}catch(ArrayIndexOutOfBoundsException aioobExp) {
				System.out.println("java.lang.ArrayIndexOutOfBoundsException:100");
				System.exit(0);
			}
			j++;
		
		}
		System.out.println("The seats booked are:");
		for(int a:userSeats) {
			System.out.println(a);
		}
	}
}
