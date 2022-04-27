import java.util.Scanner;
public class StudentResultFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr=new Scanner(System.in);
		float sub1, sub2, sub3, total, avg;
		System.out.println("First sub marks:");
		sub1=scnr.nextFloat();
		System.out.println("Second sub marks:");
		sub2=scnr.nextFloat();
		System.out.println("Third sub marks:");
		sub3=scnr.nextFloat();
		if (sub1>=45 && sub2>=45 && sub3>=45) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		total=sub1+sub2+sub3;
		avg=total/3;
		System.out.println("Total=" + total + "\nAverage Score=" +String.format("%.2f",avg));
		
	}

}
