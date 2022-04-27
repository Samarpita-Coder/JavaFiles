import java.util.Scanner; 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Credit Card Type");
        System.out.println("1.Mastercard");
        System.out.println("2.Visacard");
        int user = Integer.parseInt(sc.nextLine());
        if(user==1) {
        	String type="Mastercard";
        	System.out.println(" Enter the Holder Name");
        	String name=sc.nextLine();
        	System.out.println("Enter the Card Number");
        	String num=sc.nextLine();
        	Mastercard mc = new Mastercard(name,num,type);
        	mc.display();
        }else if(user==2) {
        	String type="Visacard";
        	System.out.println(" Enter the Holder Name");
        	String name=sc.nextLine();
        	System.out.println("Enter the Card Number");
        	String num=sc.nextLine();
        	Visacard mc = new Visacard(name,num,type);
        	mc.display();
        }else {
        	System.out.println("Invalid Account type");
        }
    }
    
}
