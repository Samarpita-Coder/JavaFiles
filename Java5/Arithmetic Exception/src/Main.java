
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cost,n, costPerDay;
		System.out.println("Enter the cost of the item for n days");
		cost=sc.nextInt();
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		try {
			costPerDay=cost/n;
			System.out.println("Cost per day of the item is "+costPerDay);
		}catch(ArithmeticException arthExp) {
			System.out.println(arthExp); //err- will show in red
		}
		
	}

}
