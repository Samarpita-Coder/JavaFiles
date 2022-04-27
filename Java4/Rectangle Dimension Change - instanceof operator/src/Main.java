import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the length of the rectangle");
    	int len=sc.nextInt();
    	System.out.println("Enter the width of the rectangle");
    	int wid=sc.nextInt();
    	Rectangle r1 = new Rectangle(len,wid);
    	r1.display();
    	int area=r1.area();
    	System.out.println("Area of the Rectangle:"+area);
    	System.out.println("Enter the new dimension");
    	int newDimension=sc.nextInt();
    	//here, r1 in LHS is the returned rectangle object from the method
    	r1=r1.dimensionChange(newDimension);
    	if(r1 instanceof Rectangle==true) {
    		r1.display();
    		area=r1.area();
    		System.out.println("Area of the Rectangle:"+area);
    	}
    }
}
    		
    	
    




