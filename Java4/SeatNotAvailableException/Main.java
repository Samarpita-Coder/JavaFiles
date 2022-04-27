import java.util.Scanner;
public class Main {
    public static void main(String args[]) throws SeatNotAvailableException{
    	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the show:");
		int n = sc.nextInt();
		System.out.println("Enter the number of seats to be booked:");
		int num = sc.nextInt();
		int seats[][] = new int[n][n];	//to be displayed
		int user_seats[]=null;
		//if (num>=0) {
		//user_seats=new int[num];
		//}
			
		
		for(int r=0; r<n; r++) {
			for(int c=0; c<n; c++) {
				seats[r][c]=0;
			}
		}
		
		for(int i=1; i<=num; i++) {
			System.out.println("Enter the seat number "+i);
			int seatNo = sc.nextInt();
			
			//for(int p=0; p<n; p++) {
				//for(int q=0; q<n; q++) {
					try {
						int count=-1;
						
						for(int j=0; j<n; j++) {	//traversing each element in matrix (seats)
							for(int k=0; k<n; k++) {
								count++;
								if(seatNo>(n*n)-1) {
									throw new SeatNotAvailableException("java.lang.ArrayIndexOutOfBoundsException: "+seatNo);
								}else {
									//user_seats[0]=seatNo;
									
									if(count==seatNo) {
										if(seats[j][k]!=1) {
											seats[j][k]=1;
	
										}else {
											System.out.println("SeatNotAvailableException: Already Booked");
										}
									}
									
								}
							}
						}
					}catch(SeatNotAvailableException exp) {
								System.out.println(exp.getMessage());
								System.out.println("The seats booked are:");
								for(int row=0; row<n; row++) {
									for(int col=0; col<n; col++) {
										System.out.print(seats[row][col]+" ");
									}
									System.out.println(" ");
								}
								System.exit(0);
					}
				}
			
			
		
		System.out.println("The seats booked are:");
		for(int row=0; row<n; row++) {
			for(int col=0; col<n; col++) {
				System.out.print(seats[row][col]+" ");
			}
			System.out.println(" ");
		}
		
		}
}
