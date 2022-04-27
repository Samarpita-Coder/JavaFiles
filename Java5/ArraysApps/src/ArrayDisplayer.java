import java.util.Scanner;
public class ArrayDisplayer {

	public static void main(String[] args) {
		Scanner scnr=new Scanner(System.in);
		float prices[]=new float[5];
		System.out.println("Enter five elements:");
		for(int index=0; index<5; index++) {
			prices[index]=scnr.nextFloat();
		}
		for(int index=0; index<5; index++) {
			System.out.println(prices[index]);
		}
		int size=prices.length;
		System.out.println("lenth is: "+size);

	}

}
