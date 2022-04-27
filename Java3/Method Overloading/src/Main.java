import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
    	Scanner sc = new Scanner(System.in);
        System.out.println("1.Equilateral triangle");
        System.out.println("2.Isosceles triangle");
        System.out.println("3.Normal Triangle");
        int user = Integer.parseInt(sc.nextLine());
        if(user==1) {
        	System.out.println("Enter the length of the side");
        	int side=sc.nextInt();
        	Triangle t = new Triangle();
        	int p = t.computePerimeter(side);
        	System.out.println("Perimeter is "+p);
        }else if(user==2) {
        	System.out.println("Enter the length of the leg side");
        	int ls = sc.nextInt();
        	System.out.println("Enter the length of the base side");
        	int bs = sc.nextInt();
        	Triangle t = new Triangle();
        	int p = t.computePerimeter(ls, bs);
        	System.out.println("Perimeter is "+p);
        }else if(user==3) {
        	System.out.println("Enter the length of the first side");
        	int f=sc.nextInt();
        	System.out.println("Enter the length of the second side");
        	int s=sc.nextInt();
        	System.out.println("Enter the length of the third side");
        	int t=sc.nextInt();
        	Triangle tr =new Triangle();
        	int p = tr.computePerimeter(f, s, t);
        	System.out.println("Perimeter is "+p);
        }
    }
    
}
