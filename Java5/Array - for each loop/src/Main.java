import java.util.Scanner; 
public class Main{ 
	public static void main (String[] args) {
		Scanner scnr=new Scanner(System.in);
		int n;
		System.out.println("Enter n :");
		n=scnr.nextInt();
		int num[]=new int[n];
		System.out.println("Enter numbers :");
		for(int i=0; i<n; i++) {
			num[i]=scnr.nextInt();
		}
		String str[]=new String[n];
		System.out.println("Enter strings :");
		for(int j=0; j<n; j++) {
			str[j]=scnr.next();
		}
		System.out.println("Displaying numbers");
		for(int m:num) {
			System.out.println(m);
		}
		System.out.println("Displaying strings");
		for(String p:str) {
			System.out.println(p);
		}
		
	} 
} 



