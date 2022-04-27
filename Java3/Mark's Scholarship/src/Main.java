import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner scnr=new Scanner(System.in);
    	int sub1, sub2, sub3, sub4, sub5;
    	System.out.println("Enter the subject 1 mark");
    	sub1=scnr.nextInt();
    	System.out.println("Enter the subject 2 mark");
    	sub2=scnr.nextInt();
    	System.out.println("Enter the subject 3 mark");
    	sub3=scnr.nextInt();
    	System.out.println("Enter the subject 4 mark");
    	sub4=scnr.nextInt();
    	System.out.println("Enter the subject 5 mark");
    	sub5=scnr.nextInt();
    	if((sub1>2 && sub2>2 && sub3>2 && sub4>2 && sub5>2) && (sub1==5 || sub2==5 || sub3==5 || sub4==5 || sub5==5) && ((sub1+sub2+sub3+sub4+sub5)/5>=4)) {
    		System.out.println("Yes");
    	}else {
    		System.out.println("No");
    	}
        
     }
}