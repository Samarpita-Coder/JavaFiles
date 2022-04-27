import java.util.Scanner; 
public class Main{ 
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int user;
		System.out.println("Enter n:");
		user=sc.nextInt();
		int num[]=new int[user];
		int i=0;
		while(i<user) {
			num[i]=sc.nextInt();
			i++;
		}
		int sum=0;
		for(int a=0; a<user; a++) {
			sum=sum+num[a];
		}
		
		System.out.println("Sum of array elements is : " + sum);

	} 
} 



