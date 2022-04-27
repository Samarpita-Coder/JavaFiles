import java.util.Scanner;

public class Main {
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
		num=Integer.parseInt(scnr.nextLine());
		int userSeats[]= new int[num];
		
		try {
			for(int j=1; j<=num; j++) {
				System.out.println("Enter the seat number "+j);
				seatNo = scnr.nextInt();
				seats[seatNo-1]=seatNo;
				userSeats[j-1]=seatNo;
			}
			System.out.println("The seats booked are:");
			for(int a:userSeats) {
				System.out.println(a);
			}
		}catch(ArrayIndexOutOfBoundsException arrExp) {
			System.out.println(arrExp);
		}
		
		
	}
}
