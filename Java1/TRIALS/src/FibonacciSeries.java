import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scnr=new Scanner(System.in);
		int num;
		System.out.println("Enter number:");
		num=scnr.nextInt();
		int sum=0;
		int firstTerm=0, secondTerm=1;
		for(int i=1; i<=num; i++) {
			System.out.print(firstTerm+" ");
			int nextTerm=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
		}
		

	}

}
